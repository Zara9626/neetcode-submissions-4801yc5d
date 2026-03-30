static class Singleton {
    private String value = null;
    private static Singleton one = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
       if(one == null){
        one = new Singleton();
       }
       return one;
    }

    public String getValue() {
        return value;

    }

    public void setValue(String value) {
        this.value = value;

    }
    
}
