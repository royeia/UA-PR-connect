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
import org.opcfoundation.ua.builtintypes.DiagnosticInfo;
import org.opcfoundation.ua.builtintypes.StatusCode;
import org.opcfoundation.ua.utils.AbstractStructure;



public class ContentFilterElementResult extends AbstractStructure {
	
	public static final ExpandedNodeId ID = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.ContentFilterElementResult.getValue());
	public static final ExpandedNodeId BINARY = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.ContentFilterElementResult_Encoding_DefaultBinary.getValue());
	public static final ExpandedNodeId XML = new ExpandedNodeId(null, NamespaceTable.OPCUA_NAMESPACE, Identifiers.ContentFilterElementResult_Encoding_DefaultXml.getValue());
	
    protected StatusCode StatusCode;
    protected StatusCode[] OperandStatusCodes;
    protected DiagnosticInfo[] OperandDiagnosticInfos;
    
    public ContentFilterElementResult() {}
    
    public ContentFilterElementResult(StatusCode StatusCode, StatusCode[] OperandStatusCodes, DiagnosticInfo[] OperandDiagnosticInfos)
    {
        this.StatusCode = StatusCode;
        this.OperandStatusCodes = OperandStatusCodes;
        this.OperandDiagnosticInfos = OperandDiagnosticInfos;
    }
    
    public StatusCode getStatusCode()
    {
        return StatusCode;
    }
    
    public void setStatusCode(StatusCode StatusCode)
    {
        this.StatusCode = StatusCode;
    }
    
    public StatusCode[] getOperandStatusCodes()
    {
        return OperandStatusCodes;
    }
    
    public void setOperandStatusCodes(StatusCode[] OperandStatusCodes)
    {
        this.OperandStatusCodes = OperandStatusCodes;
    }
    
    public DiagnosticInfo[] getOperandDiagnosticInfos()
    {
        return OperandDiagnosticInfos;
    }
    
    public void setOperandDiagnosticInfos(DiagnosticInfo[] OperandDiagnosticInfos)
    {
        this.OperandDiagnosticInfos = OperandDiagnosticInfos;
    }
    
    /**
      * Deep clone
      *
      * @return cloned ContentFilterElementResult
      */
    public ContentFilterElementResult clone()
    {
        ContentFilterElementResult result = (ContentFilterElementResult) super.clone();
        result.StatusCode = StatusCode;
        result.OperandStatusCodes = OperandStatusCodes==null ? null : OperandStatusCodes.clone();
        result.OperandDiagnosticInfos = OperandDiagnosticInfos==null ? null : OperandDiagnosticInfos.clone();
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ContentFilterElementResult other = (ContentFilterElementResult) obj;
        if (StatusCode==null) {
            if (other.StatusCode != null) return false;
        } else if (!StatusCode.equals(other.StatusCode)) return false;
        if (OperandStatusCodes==null) {
            if (other.OperandStatusCodes != null) return false;
        } else if (!Arrays.equals(OperandStatusCodes, other.OperandStatusCodes)) return false;
        if (OperandDiagnosticInfos==null) {
            if (other.OperandDiagnosticInfos != null) return false;
        } else if (!Arrays.equals(OperandDiagnosticInfos, other.OperandDiagnosticInfos)) return false;
        return true;
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((StatusCode == null) ? 0 : StatusCode.hashCode());
        result = prime * result
                + ((OperandStatusCodes == null) ? 0 : Arrays.hashCode(OperandStatusCodes));
        result = prime * result
                + ((OperandDiagnosticInfos == null) ? 0 : Arrays.hashCode(OperandDiagnosticInfos));
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
		return "ContentFilterElementResult: "+ObjectUtils.printFieldsDeep(this);
	}

}
