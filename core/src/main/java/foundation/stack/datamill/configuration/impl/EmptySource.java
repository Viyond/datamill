package foundation.stack.datamill.configuration.impl;

import java.util.Optional;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public class EmptySource extends AbstractSource {
    @Override
    public Optional<String> get(String name) {
        return Optional.empty();
    }
}