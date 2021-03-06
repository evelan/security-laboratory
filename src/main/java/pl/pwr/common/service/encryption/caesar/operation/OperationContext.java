package pl.pwr.common.service.encryption.caesar.operation;

import java.math.BigInteger;

/**
 * Created by Evelan on 19/10/2016.
 */
public class OperationContext {

    private Operation operation;

    public OperationContext(Operation operation) {
        this.operation = operation;
    }

    public char executeOperation(char singleChar, BigInteger key) {
        return operation.doOperation(singleChar, key);
    }

}
