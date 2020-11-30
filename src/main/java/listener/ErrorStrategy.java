package listener;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class ErrorStrategy implements ANTLRErrorStrategy {
    @Override
    public void reset(Parser recognizer) {

    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        return null;
    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) throws RecognitionException {

    }

    @Override
    public void sync(Parser recognizer) throws RecognitionException {

    }

    @Override
    public boolean inErrorRecoveryMode(Parser recognizer) {
        return false;
    }

    @Override
    public void reportMatch(Parser recognizer) {

    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        throw new RuntimeException("I quit!\n" + e.getMessage());
    }
}
