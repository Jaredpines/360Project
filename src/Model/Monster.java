package Model;

import java.io.Serializable;
import java.sql.SQLException;

public class Monster extends DungeonCharacter implements Serializable {
    public Monster(String theName) throws SQLException {
        super(theName);
    }
}