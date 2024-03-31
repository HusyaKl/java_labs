import java.util.Objects;
class Door {
    private boolean isLocked;

    public Door(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    @Override
    public String toString() {
        return "Door {isLocked=" + isLocked + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Door door = (Door) obj;
        return isLocked == door.isLocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLocked);
    }
}