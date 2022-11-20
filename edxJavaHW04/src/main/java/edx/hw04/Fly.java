package edx.hw04;

public class Fly {
    private double mass;
    private double speed;

    /*
    Construct with non-parameters, one-parameter and two-parameters
     */
    public Fly() {
        this.mass = 5;
        this.speed = 10;
    }

    public Fly(double mass) {
        this.mass = mass;
        this.speed = 10;
    }

    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void grow(int addMass) {
        double newMass = mass + addMass;
        if (mass <= 20 && newMass <= 20) {
            speed += 1 * addMass;
        } else if (mass <= 20 && newMass > 20) {
            speed += 1 * (20 - mass);
            speed -= 0.5 * (newMass - 20);
        } else if (mass > 20) {
            speed -= 0.5 * addMass;
        }
        mass = newMass;
    }

    public boolean isDead() {
        if (mass == 0) return true;
        else
            return false;
    }

    @Override
    public String toString() {
        if (mass == 0) {
           return "I’m dead, but I used to be a fly with a speed of " + speed;
        } else {
            return "I’m a speedy fly with " + speed+ " speed and " + mass + " mass.";
        }
    }
}
