// Interfaces

public interface BeginnerMode_IF {
    public List<String> chars;
    public List<String> weapons;
    public int damageBonus;

    public void playCharAnimation();
}

public interface IntermediateMode_IF {
    public List<String> chars;
    public List<String> weapons;
    public int damageBonus;

    public void playCharAnimation();
}

public interface AdvancedMode_IF {
    public List<String> chars;
    public List<String> weapons;
    public int damageBonus;

    public void playCharAnimation();
}

public interface AbstractFactory_IF {
    public BeginnerMode_IF createBeginnerMode();
    public IntermediateMode_IF createIntermediateMode();
    public AdvancedMode_IF createAdvancedMode();
}


// Classes

// Factories
public class Utility {
    public AbstractFactory_IF createCtrlObjFactory(String model) {
        if (model.equals("CharSelect")) {
            return new CtrlObjFactory_CharSelect();
        }
        else if (model.equals("WeaponSelect")) {
            return new CtrlObjFactory_WeaponSelect();
        }
        else {
            return null;
        }
    }
}

public class CtrlObjFactory_CharSelect implements AbstractFactory_IF {
    public BeginnerMode_IF createBeginnerMode() {
        return new CharSelect_Beginner();
    }
    public IntermediateMode_IF createIntermediateMode() {
        return new CharSelect_Intermediate();
    }
    public AdvancedMode_IF createAdvancedMode() {
        return new CharSelect_Advanced();
    }
}

public class CtrlObjFactory_WeaponSelect implements AbstractFactory_IF {
    public BeginnerMode_IF createBeginnerMode() {
        return new WeaponSelect_Beginner();
    }
    public IntermediateMode_IF createIntermediateMode() {
        return new WeaponSelect_Intermediate();
    }
    public AdvancedMode_IF createAdvancedMode() {
        return new WeaponSelect_Advanced();
    }
}


// Begnner Mode
public class CharSelect_Beginner implements BeginnerMode_IF {
    public List<String> chars;
    public void playCharAnimation() {
        System.out.println("Funny Little Hop");
    }
}
public class WeaponSelect_Beginner implements BeginnerMode_IF {
    public List<String> weapons;
    public int damageBonus;
}

// Intermediate Mode
public class CharSelect_Intermediate implements IntermediateMode_IF {
    public List<String> chars;
    public void playCharAnimation() {
        System.out.println("Cool Spin");
    }
}
public class WeaponSelect_Intermediate implements IntermediateMode_IF {
    public List<String> weapons;
    public int damageBonus;
}

// Advanced Mode
public class CharSelect_Advanced implements AdvancedMode_IF {
    public List<String> chars;
    public void playCharAnimation() {
        System.out.println("Epic Backflip");
    }
}
public class WeaponSelect_Advanced implements AdvancedMode_IF {         
    public List<String> weapons;
    public int damageBonus;
}


// Main
public class Main {
    public static void main(String[] args) {
        Utility util = new Utility();
        AbstractFactory_IF charSelectFactory = util.createCtrlObjFactory("CharSelect");
        AbstractFactory_IF weaponSelectFactory = util.createCtrlObjFactory("WeaponSelect");

        BeginnerMode_IF beginnerCharSelect = charSelectFactory.createBeginnerMode();
        IntermediateMode_IF intermediateCharSelect = charSelectFactory.createIntermediateMode();
        AdvancedMode_IF advancedCharSelect = charSelectFactory.createAdvancedMode();

        BeginnerMode_IF beginnerWeaponSelect = weaponSelectFactory.createBeginnerMode();
        IntermediateMode_IF intermediateWeaponSelect = weaponSelectFactory.createIntermediateMode();
        AdvancedMode_IF advancedWeaponSelect = weaponSelectFactory.createAdvancedMode();

        // Assign damage bonuses
        beginnerWeaponSelect.damageBonus = 30;
        intermediateWeaponSelect.damageBonus = 15;
        advancedWeaponSelect.damageBonus = 0;


        // Test the created objects
        beginnerCharSelect.playCharAnimation(); // Output: "Funny Little Hop"
        intermediateCharSelect.playCharAnimation(); // Output: "Cool Spin"
        advancedCharSelect.playCharAnimation(); // Output: "Epic Backflip"

        System.out.println("Beginner Weapon Damage Bonus: " + beginnerWeaponSelect.damageBonus);
        System.out.println("Intermediate Weapon Damage Bonus: " + intermediateWeaponSelect.damageBonus);
        System.out.println("Advanced Weapon Damage Bonus: " + advancedWeaponSelect.damageBonus);

    }
}