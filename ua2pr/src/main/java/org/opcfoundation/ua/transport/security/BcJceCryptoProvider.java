/* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/
package org.opcfoundation.ua.transport.security;

import org.opcfoundation.ua.utils.CryptoUtil;

/**
 * <p>BcJceCryptoProvider class.</p>
 *
 */
public class BcJceCryptoProvider extends JceCryptoProvider implements CryptoProvider {

	/**
	 * <p>Constructor for BcJceCryptoProvider.</p>
	 */
	public BcJceCryptoProvider() {
		super(CryptoUtil.loadOrInstallProvider("BC", "org.bouncycastle.jce.provider.BouncyCastleProvider"));
	}

}
