package pl.pwr.common.connection.listener;

import pl.pwr.common.model.*;

import java.io.IOException;

/**
 * Created by Evelan on 18/10/2016.
 */
public interface Listener {

    Message waitForMessage() throws IOException;

    EncryptionType waitForEncryptionType() throws IOException;

    SecretKey waitForSecretKey();

    PublicKey waitForPublicKeys() throws IOException;

    KeyRequest waitForKeysRequest() throws IOException;

}