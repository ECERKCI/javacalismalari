public class Main {
    public static void main(String[] args) {
BaseKrediManager [] krediManagers = new BaseKrediManager[] { new ogretmenKrediManager(),new TarimKrediManager(), new ogrenciKrediManager()};
for  (BaseKrediManager krediManager: krediManagers){
   System.out.println(krediManager. hesapla (1000));
}

    }
}