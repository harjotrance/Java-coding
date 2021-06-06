package codingSection9.Ex1;

import java.util.List;

public interface ISaveable {

        List<String> write();
        void read(List<String> savedValues);

}

