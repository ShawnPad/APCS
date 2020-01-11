class MyComplex{
    private double real,img;
    MyComplex(){
        this(0,0);
    }
    MyComplex(double real, double img){
        this.real = real;
        this.img = img;
    }
    public String toString(){
        if (img<0){
            return ""+real+"-"+Math.abs(img)+"i";
        } else {
            return ""+real+"+"+img+"i";
        }

    }
    double getReal(){
        return real;
    }
    double getImg(){
        return img;
    }
    boolean isReal(){
        return img==0;
    }
    boolean isImaginary(){
        return real==0;
    }
    void add(MyComplex c){
        real= real + c.getReal();
        img = img + c.getImg();
    }
    void multiply(MyComplex c){
        double realTemp = real;
        real = real * c.getReal() - img * c.getImg();
        img = realTemp*c.getImg()+img*c.getReal();
    }
    void conjugate(){
        img *= -1;
    }
    double argument(){
        return Math.atan2(img,real);
    }
    double magnitude(){
        return Math.sqrt(real*real + img*img);
    }
    static MyComplex addNew(MyComplex a, MyComplex b){
        MyComplex temp = new MyComplex(a.getReal(),a.getImg());
        temp.add(b);
        return new MyComplex(temp.getReal(), temp.getImg());

    }
    static MyComplex multiplyNew(MyComplex a, MyComplex b){
        MyComplex temp = new MyComplex(a.getReal(),a.getImg());
        temp.multiply(b);
        return new MyComplex(a.getReal(), a.getImg());
    }

}