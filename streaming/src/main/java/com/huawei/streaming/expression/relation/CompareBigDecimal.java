/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.streaming.expression.relation;

import java.math.BigDecimal;

import com.huawei.streaming.common.StreamClassUtil;

/**
 * BigDecimal类型关系运算
 * 
 * 
 */
public class CompareBigDecimal implements ICompare
{
    
    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -4366969494649724129L;
    
    /** {@inheritDoc} */
    @Override
    public Boolean equals(Object left, Object right)
    {
        Number nl = (Number)left;
        Number nr = (Number)right;
        
        return CompareBoolean.truthValue(nl, nr, compare(nl, nr) == 0);
    }
    
    /** {@inheritDoc} */
    @Override
    public Boolean notEquals(Object left, Object right)
    {
        Number nl = (Number)left;
        Number nr = (Number)right;
        
        return CompareBoolean.truthValue(nl, nr, compare(nl, nr) != 0);
    }
    
    /** {@inheritDoc} */
    @Override
    public Boolean lessThan(Object left, Object right)
    {
        Number nl = (Number)left;
        Number nr = (Number)right;
        
        return CompareBoolean.truthValue(nl, nr, compare(nl, nr) < 0);
    }
    
    /** {@inheritDoc} */
    @Override
    public Boolean greaterThan(Object left, Object right)
    {
        Number nl = (Number)left;
        Number nr = (Number)right;
        
        return CompareBoolean.truthValue(nl, nr, compare(nl, nr) > 0);
    }
    
    /** {@inheritDoc} */
    @Override
    public Boolean lessOrEquals(Object left, Object right)
    {
        Number nl = (Number)left;
        Number nr = (Number)right;
        
        return CompareBoolean.truthValue(nl, nr, compare(nl, nr) <= 0);
    }
    
    /** {@inheritDoc} */
    @Override
    public Boolean greaterOrEquals(Object left, Object right)
    {
        Number nl = (Number)left;
        Number nr = (Number)right;
        
        return CompareBoolean.truthValue(nl, nr, compare(nl, nr) >= 0);
    }
    
    private int compare(Number nl, Number nr)
    {
        BigDecimal left = StreamClassUtil.getBigDecimalValue(nl);
        BigDecimal right = StreamClassUtil.getBigDecimalValue(nr);
        return left.compareTo(right);
    }
    
}
