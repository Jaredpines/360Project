package ControllerTest;
import Model.Warrior;
import org.junit.jupiter.api.Test;
import Controller.ToScreen;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
public class ControlTest {
    @Test
    void heroToScreenTest() throws SQLException {
        Warrior myWarrior = new Warrior("Warrior");
        ToScreen myToScreen = new ToScreen();
        StringBuilder stats = new StringBuilder();
        stats.append("hit points: ").append(myWarrior.getMyHitPoints()).append("\n");
        stats.append("attack speed: ").append(myWarrior.getMyAttackSpeed()).append("\n");
        stats.append("chance to hit: ").append(myWarrior.getMyChanceToHit()).append("\n");
        stats.append("minimum damage: ").append(myWarrior.getMINIMUM_DAMAGE()).append("\n");
        stats.append("maximum damage: ").append(myWarrior.getMyMaximumDamage()).append("\n");
        stats.append("chance to block: ").append(myWarrior.getMyChangesToBlockOrHeal()).append("\n");
        myToScreen.heroToScreen("Warrior");
        assertEquals(stats.toString(), myToScreen.heroToScreen("Warrior").toString());

    }
}
