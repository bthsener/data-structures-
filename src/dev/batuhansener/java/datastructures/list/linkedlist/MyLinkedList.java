package dev.batuhansener.java.datastructures.list.linkedlist;

public class MyLinkedList {

    private Node bas;
    private Node son;

    public MyLinkedList(){
        bas = null;
        son = null;
    }

    public void basaEkle(int sayi){
        Node deneme = new Node(sayi);
        if (bas!=null){
            deneme.next = bas;
            bas = deneme;
        }else{
            bas = deneme;
            son = deneme;
        }
    }

    public void sonaEkle(int sayi){
        Node deneme = new Node(sayi);
        if (bas!=null){
            son.next = deneme;
            son = deneme;
        }else{
            bas = deneme;
            son = deneme;
        }
    }

    public void indiseEkle(int sayi, int indis){
        Node deneme = new Node(sayi);
        if (bas!=null){
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

    public void listele(){
        Node iterator = bas;
        while(iterator!=null){
            System.out.println(iterator);
            iterator = iterator.next;
        }
    }



}
