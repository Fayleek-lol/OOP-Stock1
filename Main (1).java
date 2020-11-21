class Main {
    public static void main(String [] args){
        
        Stock1 st0 = new Stock1();
        Stock1 st1 = new Stock1("Книга");
        Stock1 st3 = new Stock1("Ручка" , 500 , true);
        Stock1 stc = new Stock1(st0);
        
        st0.printAboutObject();
        st1.printAboutObject();
        st3.printAboutObject();
        stc.printAboutObject();
    }
}