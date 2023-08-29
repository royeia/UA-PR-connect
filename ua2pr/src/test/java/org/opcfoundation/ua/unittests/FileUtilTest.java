package org.opcfoundation.ua.unittests;

import junit.framework.TestCase;
import org.opcfoundation.ua.utils.FileUtil;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;

public class FileUtilTest extends TestCase {
    public void testCreateDeleteFile() throws IOException {
        FileUtil.createCloseDeleteEmptyFile();
        FileUtil.createWriteCloseDeleteFile();
    }
    public void testManageKeyStoreExample() throws KeyStoreException, NoSuchProviderException, IOException, CertificateException, NoSuchAlgorithmException {
        FileUtil.manageKeyStoreExample();
        //FIXME linkar com estes testes comentados:
        // TestCertificates.testPfx()
    }
}