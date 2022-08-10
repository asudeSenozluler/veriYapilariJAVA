class veriYapilari {

    int[] dizi;
    int boyut, ust;

    public veriYapilari(int boyut) {
        this.boyut = boyut;
        this.dizi = new int[this.boyut];
        this.ust = -1;
    }

    void push(int sayi) {
        if (!isFull()) {

            ust++;
            dizi[ust] = sayi;
            System.out.println("Ekleme başarılı: "+sayi);
        } else {
            System.out.println("Yığıt dolu. Eklenemedi: "+sayi);
        }
    }

    int pop() {

        if (!isEmpty()) {

            ust--;
            System.out.println("Çıkarıldı: "+dizi[ust+1]);
            return dizi[ust+1];
        }else{ // yığıt boş ise
            System.out.println("Yığıt boş");
            return -1;
        }

    }

    int top(){

        if(!isEmpty()){
            return dizi[ust];
        }else{
            return -1;
        }
    }

    boolean isEmpty(){

        if(ust == -1){
            return true;
        }else{
            return false;
        }
    }

    boolean isFull() {
        if (ust == this.boyut - 1) {
            return true;
        } else {
            return false;
        }
    }

}

public class Main {

    public static void main(String[] args) {
        veriYapilari y = new veriYapilari(5);
        y.push(5);
        y.push(7);
        y.push(8);
        y.push(2);
        y.push(4);

        y.push(10);

        int cikan = y.pop();
        System.out.println("Çıkarılan eleman: "+cikan);
        y.push((11));
    }
}
