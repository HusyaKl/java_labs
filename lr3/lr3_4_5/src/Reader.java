class Reader {
    private String name;
    private boolean onBlacklist;

    public Reader(String name) {
        this.name = name;
        this.onBlacklist = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOnBlacklist() {
        return onBlacklist;
    }

    public void addToBlacklist() {
        this.onBlacklist = true;
        System.out.println(this.name + " добавлена в черный список.");
    }
}