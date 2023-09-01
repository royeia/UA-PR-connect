package org.opcfoundation.ua.examples;

import org.opcfoundation.ua.application.Client;
import org.opcfoundation.ua.application.SessionChannel;
import org.opcfoundation.ua.builtintypes.LocalizedText;
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.core.*;

// FIXME remover esta dependência
import org.opcfoundation.ua.examples.certs.ExampleKeys;

import org.opcfoundation.ua.transport.security.KeyPair;

import java.util.Arrays;
import java.util.Locale;

public class SampleClient {
  private static final String URL_PADRAO = "opc.tcp://10.158.64.10:4840";
  public static void main(String[] args) throws Exception {
    String url = null;
    if (args.length == 0) {
      url = URL_PADRAO;
      //log.("Usage: URL da PR");
    } else {
      url = args[0];
      System.out.print("Connecting to " + url + " .. ");
    }

    // TODO Create Client whith out SmpleClient em getCert abaixo. Sem esta dependência

    // Set default key size for created certificates. The default value is also 2048,
    // but in some cases you may want to specify a different size.
    //CertificateUtils.setKeySize(2048);

    // Try to load an application certificate with the specified application name.
    // In case it is not found, a new certificate is created.
    final KeyPair pair = ExampleKeys.getCert("SampleClient");
    // Create the client using information provided by the created certificate
    final Client myClient = Client.createClientApplication(pair);

    myClient.getApplication().addLocale(Locale.ENGLISH);
    myClient.getApplication().setApplicationName(new LocalizedText("Java Sample Client", Locale.ENGLISH));
    myClient.getApplication().setProductUri("urn:JavaSampleClient");

    SessionChannel mySession = myClient.createSessionChannel(url);
    mySession.activate();

    BrowseDescription browse = new BrowseDescription();
    browse.setNodeId(Identifiers.RootFolder);
    browse.setBrowseDirection(BrowseDirection.Forward);
    browse.setIncludeSubtypes(true);
    browse.setNodeClassMask(NodeClass.Object, NodeClass.Variable);
    browse.setResultMask(BrowseResultMask.All);
    BrowseResponse res3 = mySession.Browse(null, null, null, browse);
    System.out.println(res3);

    // Read Namespace Array
    ReadResponse res5 = mySession.Read(null, null, TimestampsToReturn.Neither,
            new ReadValueId(Identifiers.Server_NamespaceArray, Attributes.Value, null, null));
    String[] namespaceArray = (String[]) res5.getResults()[0].getValue().getValue();
    System.out.println(Arrays.toString(namespaceArray));

    // Read a variable (Works with NanoServer example!)
    ReadResponse res4 = mySession.Read(null, 500.0, TimestampsToReturn.Source,
            new ReadValueId(new NodeId(1, "Boolean"), Attributes.Value, null, null));
    System.out.println(res4);

    // Press enter to shutdown
    System.out.println("Enter 'x' to shutdown");
    while (System.in.read() != 'x') {
      ;
    }

    mySession.close();
    mySession.closeAsync();
  }
}
