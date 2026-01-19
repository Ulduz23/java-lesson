package lesson6;

class BadKey {
    private final int id;

    public BadKey(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1; // BÜTÜN key-lər eyni bucket-ə düşsün
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BadKey)) return false;
        BadKey other = (BadKey) obj;
        return this.id == other.id;
    }
}
