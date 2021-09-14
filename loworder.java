 public void display() {
        System.out.print("product code :", +pcode);
        System.out.print("product name :", +pname);
        System.out.print("product price :", +price);
    }

    public void lowprice() {
        product temp = new product();

        if (this.price < p1.price && this.price < p2.price)
            temp = this;
        else if(p1.price < this.price && p1.price < p2.price)
            temp = p1;
        else if(p2.price < this.price && p2.price < p1.price)
            temp = p2;

        return temp;

    }

}

class loworder {
    public static void main (string args[]) {

        product p = new product();
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        p1.data();
        p2.data();
        p3.data();
        p = p3.low(p1, p2);

        p1.display();
        p2.display();
        p3.display();

        System.out.print("lowest price :", +p.price);
    }
}
