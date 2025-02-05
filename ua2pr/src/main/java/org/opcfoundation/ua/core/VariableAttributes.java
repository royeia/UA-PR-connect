/* ========================================================================
 * Copyright (c) 2005-2015 The OPC Foundation, Inc. All rights reserved.
 *
 * OPC Foundation MIT License 1.00
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * The complete license agreement can be found here:
 * http://opcfoundation.org/License/MIT/1.00/
 * ======================================================================*/

package org.opcfoundation.ua.core;

import org.opcfoundation.ua.builtintypes.Structure;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.core.Identifiers;
import org.opcfoundation.ua.utils.ObjectUtils;
import org.opcfoundation.ua.common.NamespaceTable;

import java.util.Arrays;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.UnsignedByte;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.builtintypes.Variant;
import org.opcfoundation.ua.core.NodeAttributes;



public class VariableAttributes extends NodeAttributes {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.VariableAttributes.getValue());
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.VariableAttributes_Encoding_DefaultBinary.getValue());
	public static final ExpandedNodeId XML = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.VariableAttributes_Encoding_DefaultXml.getValue());
	
    protected Variant Value;
    protected NodeId DataType;
    protected Integer ValueRank;
    protected UnsignedInteger[] ArrayDimensions;
    protected UnsignedByte AccessLevel;
    protected UnsignedByte UserAccessLevel;
    protected Double MinimumSamplingInterval;
    protected Boolean Historizing;
    
    public VariableAttributes() {}
    
    public VariableAttributes(UnsignedInteger SpecifiedAttributes, LocalizedText DisplayName, LocalizedText Description, UnsignedInteger WriteMask, UnsignedInteger UserWriteMask, Variant Value, NodeId DataType, Integer ValueRank, UnsignedInteger[] ArrayDimensions, UnsignedByte AccessLevel, UnsignedByte UserAccessLevel, Double MinimumSamplingInterval, Boolean Historizing)
    {
        super(SpecifiedAttributes, DisplayName, Description, WriteMask, UserWriteMask);
        this.Value = Value;
        this.DataType = DataType;
        this.ValueRank = ValueRank;
        this.ArrayDimensions = ArrayDimensions;
        this.AccessLevel = AccessLevel;
        this.UserAccessLevel = UserAccessLevel;
        this.MinimumSamplingInterval = MinimumSamplingInterval;
        this.Historizing = Historizing;
    }
    
    public Variant getValue()
    {
        return Value;
    }
    
    public void setValue(Variant Value)
    {
        this.Value = Value;
    }
    
    public NodeId getDataType()
    {
        return DataType;
    }
    
    public void setDataType(NodeId DataType)
    {
        this.DataType = DataType;
    }
    
    public Integer getValueRank()
    {
        return ValueRank;
    }
    
    public void setValueRank(Integer ValueRank)
    {
        this.ValueRank = ValueRank;
    }
    
    public UnsignedInteger[] getArrayDimensions()
    {
        return ArrayDimensions;
    }
    
    public void setArrayDimensions(UnsignedInteger[] ArrayDimensions)
    {
        this.ArrayDimensions = ArrayDimensions;
    }
    
    public UnsignedByte getAccessLevel()
    {
        return AccessLevel;
    }
    
    public void setAccessLevel(UnsignedByte AccessLevel)
    {
        this.AccessLevel = AccessLevel;
    }
    
    public UnsignedByte getUserAccessLevel()
    {
        return UserAccessLevel;
    }
    
    public void setUserAccessLevel(UnsignedByte UserAccessLevel)
    {
        this.UserAccessLevel = UserAccessLevel;
    }
    
    public Double getMinimumSamplingInterval()
    {
        return MinimumSamplingInterval;
    }
    
    public void setMinimumSamplingInterval(Double MinimumSamplingInterval)
    {
        this.MinimumSamplingInterval = MinimumSamplingInterval;
    }
    
    public Boolean getHistorizing()
    {
        return Historizing;
    }
    
    public void setHistorizing(Boolean Historizing)
    {
        this.Historizing = Historizing;
    }
    
    /**
      * Deep clone
      *
      * @return cloned VariableAttributes
      */
    public VariableAttributes clone()
    {
        VariableAttributes result = (VariableAttributes) super.clone();
        result.SpecifiedAttributes = SpecifiedAttributes;
        result.DisplayName = DisplayName;
        result.Description = Description;
        result.WriteMask = WriteMask;
        result.UserWriteMask = UserWriteMask;
        result.Value = Value;
        result.DataType = DataType;
        result.ValueRank = ValueRank;
        result.ArrayDimensions = ArrayDimensions==null ? null : ArrayDimensions.clone();
        result.AccessLevel = AccessLevel;
        result.UserAccessLevel = UserAccessLevel;
        result.MinimumSamplingInterval = MinimumSamplingInterval;
        result.Historizing = Historizing;
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        VariableAttributes other = (VariableAttributes) obj;
        if (SpecifiedAttributes==null) {
            if (other.SpecifiedAttributes != null) return false;
        } else if (!SpecifiedAttributes.equals(other.SpecifiedAttributes)) return false;
        if (DisplayName==null) {
            if (other.DisplayName != null) return false;
        } else if (!DisplayName.equals(other.DisplayName)) return false;
        if (Description==null) {
            if (other.Description != null) return false;
        } else if (!Description.equals(other.Description)) return false;
        if (WriteMask==null) {
            if (other.WriteMask != null) return false;
        } else if (!WriteMask.equals(other.WriteMask)) return false;
        if (UserWriteMask==null) {
            if (other.UserWriteMask != null) return false;
        } else if (!UserWriteMask.equals(other.UserWriteMask)) return false;
        if (Value==null) {
            if (other.Value != null) return false;
        } else if (!Value.equals(other.Value)) return false;
        if (DataType==null) {
            if (other.DataType != null) return false;
        } else if (!DataType.equals(other.DataType)) return false;
        if (ValueRank==null) {
            if (other.ValueRank != null) return false;
        } else if (!ValueRank.equals(other.ValueRank)) return false;
        if (ArrayDimensions==null) {
            if (other.ArrayDimensions != null) return false;
        } else if (!Arrays.equals(ArrayDimensions, other.ArrayDimensions)) return false;
        if (AccessLevel==null) {
            if (other.AccessLevel != null) return false;
        } else if (!AccessLevel.equals(other.AccessLevel)) return false;
        if (UserAccessLevel==null) {
            if (other.UserAccessLevel != null) return false;
        } else if (!UserAccessLevel.equals(other.UserAccessLevel)) return false;
        if (MinimumSamplingInterval==null) {
            if (other.MinimumSamplingInterval != null) return false;
        } else if (!MinimumSamplingInterval.equals(other.MinimumSamplingInterval)) return false;
        if (Historizing==null) {
            if (other.Historizing != null) return false;
        } else if (!Historizing.equals(other.Historizing)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((SpecifiedAttributes == null) ? 0 : SpecifiedAttributes.hashCode());
        result = prime * result
                + ((DisplayName == null) ? 0 : DisplayName.hashCode());
        result = prime * result
                + ((Description == null) ? 0 : Description.hashCode());
        result = prime * result
                + ((WriteMask == null) ? 0 : WriteMask.hashCode());
        result = prime * result
                + ((UserWriteMask == null) ? 0 : UserWriteMask.hashCode());
        result = prime * result
                + ((Value == null) ? 0 : Value.hashCode());
        result = prime * result
                + ((DataType == null) ? 0 : DataType.hashCode());
        result = prime * result
                + ((ValueRank == null) ? 0 : ValueRank.hashCode());
        result = prime * result
                + ((ArrayDimensions == null) ? 0 : Arrays.hashCode(ArrayDimensions));
        result = prime * result
                + ((AccessLevel == null) ? 0 : AccessLevel.hashCode());
        result = prime * result
                + ((UserAccessLevel == null) ? 0 : UserAccessLevel.hashCode());
        result = prime * result
                + ((MinimumSamplingInterval == null) ? 0 : MinimumSamplingInterval.hashCode());
        result = prime * result
                + ((Historizing == null) ? 0 : Historizing.hashCode());
        return result;
    }
    


	public ExpandedNodeId getTypeId() {
		return ID;
	}

	public ExpandedNodeId getXmlEncodeId() {
		return XML;
	}

	public ExpandedNodeId getBinaryEncodeId() {
		return BINARY;
	}
	
	public String toString() {
		return "VariableAttributes: "+ObjectUtils.printFieldsDeep(this);
	}

}
