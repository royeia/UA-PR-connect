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

import org.opcfoundation.ua.utils.AbstractStructure;



public class ComplexNumberType extends AbstractStructure {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.ComplexNumberType.getValue());
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.ComplexNumberType_Encoding_DefaultBinary.getValue());
	public static final ExpandedNodeId XML = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.ComplexNumberType_Encoding_DefaultXml.getValue());
	
    protected Float Real;
    protected Float Imaginary;
    
    public ComplexNumberType() {}
    
    public ComplexNumberType(Float Real, Float Imaginary)
    {
        this.Real = Real;
        this.Imaginary = Imaginary;
    }
    
    public Float getReal()
    {
        return Real;
    }
    
    public void setReal(Float Real)
    {
        this.Real = Real;
    }
    
    public Float getImaginary()
    {
        return Imaginary;
    }
    
    public void setImaginary(Float Imaginary)
    {
        this.Imaginary = Imaginary;
    }
    
    /**
      * Deep clone
      *
      * @return cloned ComplexNumberType
      */
    public ComplexNumberType clone()
    {
        ComplexNumberType result = (ComplexNumberType) super.clone();
        result.Real = Real;
        result.Imaginary = Imaginary;
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ComplexNumberType other = (ComplexNumberType) obj;
        if (Real==null) {
            if (other.Real != null) return false;
        } else if (!Real.equals(other.Real)) return false;
        if (Imaginary==null) {
            if (other.Imaginary != null) return false;
        } else if (!Imaginary.equals(other.Imaginary)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((Real == null) ? 0 : Real.hashCode());
        result = prime * result
                + ((Imaginary == null) ? 0 : Imaginary.hashCode());
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
		return "ComplexNumberType: "+ObjectUtils.printFieldsDeep(this);
	}

}
