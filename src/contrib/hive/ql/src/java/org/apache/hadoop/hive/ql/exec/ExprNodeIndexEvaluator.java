/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.exec;

import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.plan.exprNodeIndexDesc;
import org.apache.hadoop.hive.serde.SerDeField;

public class ExprNodeIndexEvaluator extends ExprNodeEvaluator {

  protected exprNodeIndexDesc expr;
  transient ExprNodeEvaluator mainEvaluator;
  transient ExprNodeEvaluator indexEvaluator;
  transient SerDeField field;
  
  public ExprNodeIndexEvaluator(exprNodeIndexDesc expr) {
    this.expr = expr;
    mainEvaluator = ExprNodeEvaluatorFactory.get(expr.getDesc());
    indexEvaluator = ExprNodeEvaluatorFactory.get(expr.getIndex());
  }

  public Object evaluateToObject(HiveObject row)  throws HiveException {
    return evaluate(row).getJavaObject();
  }

  public HiveObject evaluate(HiveObject row) throws HiveException {
    HiveObject ho = mainEvaluator.evaluate(row);
    if (field == null || !(indexEvaluator instanceof ExprNodeConstantEvaluator)) {
      // TODO: This optimization is wrong because of the field implementation inside HiveObject.
      // The problem is that at the second "[" (after "c"), "field" caches both "index1" and 
      // "index2" in "a.b[index1].c[index2]", while it should only cache "index2".
      field = ho.getFieldFromExpression("[" + indexEvaluator.evaluateToObject(row) + "]");
    }
    return ho.get(field);
  }
}