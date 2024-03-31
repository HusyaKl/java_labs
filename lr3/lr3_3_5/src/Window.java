import java.util.Objects;
class Window {
    private boolean isOpen;

    public Window(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    @Override
    public String toString() {
        return "Window {isOpen=" + isOpen + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Window window = (Window) obj;
        return isOpen == window.isOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen);
    }
}