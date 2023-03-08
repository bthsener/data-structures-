package dev.batuhansener.java.datastructures.list.linkedlist;

public class MyLinkedList{

    private Node bas;
    private Node son;

    public MyLinkedList(){
        bas = null;
        son = null;
    }

    public void basaEkle(int sayi){
        Node deneme = new Node(sayi);
        if (doluMu()){
            deneme.next = bas;
            bas = deneme;
        }else{
            bas = deneme;
            son = deneme;
        }
    }

    public void sonaEkle(int sayi){
        Node deneme = new Node(sayi);
        if (doluMu()){
            son.next = deneme;
            son = deneme;
        }else{
            bas = deneme;
            son = deneme;
        }
    }

    public void indiseEkle(int sayi, int indis){
        Node deneme = new Node(sayi);
        if (doluMu()){
            //ilk indise ekleme yapacaksa bu yöntemi kullanıyor
            if (indis == 0){
                deneme.next = bas;
                bas = deneme;
            }else{
                int sayac = 0;
                //ilgili aralıkta bulunan node istenen1 ve işaret ettiği istenen2
                Node istenen1 = null;
                Node istenen2 = bas;
                //indis sayacı ve aynı zamanda istenen2nin
                while (sayac<=indis&&istenen2.next!=null){
                    istenen1 = istenen2;
                    istenen2 = istenen2.next;
                    sayac++;
                }if (istenen2.next==null){
                    istenen2.next = deneme;
                    son = deneme;
                }else{
                    istenen1.next = deneme;
                    deneme.next = istenen2;
                }

            }
        }else{
            bas = deneme;
            son = deneme;
        }
    }

    public void bastanSil(){
        if (doluMu()){
            Node deneme;
            //tek elemanlı liste mi diye kontrol
            if (tekElemanlimi()){
                bas = null;
                son = null;
            }else{
                deneme = bas;// (bu) bu iki yerde aslında garbage collection hafifletiyoruz sildiğimiz elemanı null yapıyoruz
                bas = bas.next;
                deneme = null;// (bu)
            }
        }else{
            System.out.println("liste bos zaten");
        }
    }

    public void sondanSil(){
        if (doluMu()){
            if (tekElemanlimi()){
                bas = null;
                son = null;
            }else{
                Node deneme1 = null;
                Node deneme2 = bas;
                while(deneme2.next!=null){
                    deneme1 = deneme2;
                    deneme2 = deneme2.next;
                }
                deneme1.next = null;
                son = deneme1;
            }
        }else{
            System.out.println("liste bos zaten");
        }
    }

    public void tersCevirYaz(){
        Node onceki = null;
        Node sonraki = null;
        Node suanki = bas;

        while (suanki!=null){
            sonraki = suanki.next;
            suanki.next = onceki;
            onceki = suanki;
            suanki = sonraki;
        }

        while (onceki!=null){
            System.out.println(onceki.getVal());
            onceki = onceki.next;
        }
    }

    public Boolean doluMu(){
        if (bas != null){
            return true;
        }
        return false;
    }

    public Boolean tekElemanlimi(){
        if (bas.next == null){
            return true;
        }
        return false;
    }

    public void listele(){
        Node iterator = bas;
        while(iterator!=null){
            System.out.println(iterator);
            iterator = iterator.next;
        }
    }



}
