package edx.hw04;

public class Frog {
    private String name;
    private  int age;
    private double tongueSpeed;
    private boolean isFroglet = true;
    private String species = "Rare Pepe";

    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        if (age > 7) isFroglet = false;
    }

    public Frog(String name, double ageInYears, double tongueSpeed) {
        this.name = name;
        this.age = (int) (12 * ageInYears);
        this.tongueSpeed = tongueSpeed;
        if (age > 7) isFroglet = false;
    }

    public Frog(String name) {
        this.name = name;
        this.age = 5;
        this.tongueSpeed = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTongueSpeed() {
        return tongueSpeed;
    }

    public void setTongueSpeed(double tongueSpeed) {
        this.tongueSpeed = tongueSpeed;
    }

    public boolean isFroglet() {
        return isFroglet;
    }

    public void setFroglet(boolean froglet) {
        isFroglet = froglet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void grow(int addAge) {
        int newAge = age + addAge;
        if (newAge > 7)  {
            isFroglet = false;
        }
        if (newAge <= 12) {
            tongueSpeed += 1 * addAge;
        } else if (age <= 12 && newAge > 12) {
            tongueSpeed += 12 - age;
        } else if (newAge > 30) {
            tongueSpeed -= 1* addAge;
            if (tongueSpeed < 5)
                tongueSpeed = 5;
        }
        age = newAge;

    }

    public void grow() {
        grow(1);
    }

    public void eat(Fly fly) {
        if(fly.isDead()) return;
        if (tongueSpeed > fly.getSpeed()) {
            fly.setMass(0);
            if (fly.getMass() >= 0.5 * age) {
                grow();
            }
        }else if (tongueSpeed < fly.getSpeed()) {
            fly.grow(1);
        }

    }

    @Override
    public String toString() {
        if (isFroglet == true) {
            return "My name is " + name + " and I’m a rare froglet! I’m " + age +" months old and my tongue has a speed" +
                    " of " + tongueSpeed + ".";
        } else {
            return "My name is " + name + " and I’m a rare frog. I’m " + age +" months old and my tongue has a speed " +
                    "of " + tongueSpeed + ".";
        }


    }
}
