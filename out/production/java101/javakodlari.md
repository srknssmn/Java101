# JAVA KOMUTLARI

## Başlangıç Komutu
**main** ile kısayol girişi

- public static void main(String[] args) {}

## Çıktı Komutu
**sout** ile kısayol girişi

- System.out.println("Hello");  (println ile ALT SATIRA İNDİRME KOMUTU)
- System.out.print("Hello");

**NOT:** **" "** Çift tırnak kullanımı METİN olduğunu belirtiyor.

### KAÇIŞ KISAYOLLARI
- \n Alt satıra indirme: System.out.print(Pusula\nFinans);
- \t Tab boşluk ekle
- \r Satır başı ekler (kullanımdan öncekileri göstermez)
- \b Backspace ekler
- \\' Kesme işareti ekler
- \\" Çift Tırnak işareti ekler
- \\\ Ters slash ekler

## İsimlendirme Kuralları

- Sınıflar: CamelCase
- Metotlar: camelCase
- Değişkenler: camelCase
- Sabitler: CAMEL_CASE

## Yorum Satırları

- **//** ile tek satıra yorum yazılır ve çıktıda gösterilmez.
- /* */ ile birden fazla satıra yorum yazılır ve çıktıda gösterilmez.
- /** */ ile javadoc kod ile kod yazarı ile ilgili bilgiler yazılır.

## Variables (Değişkenler)

### Primitive Variables
#### Tam Sayı Veri Tipleri

- byte (8 bit) (127 ve -128 arasındaki tam sayılar için kullanılır)
- short (16 bit) (32.767 ve -32768 arasındaki tam sayılar için kullanılır)
- int (32 bit) (2147483647 ve -2147483648 arasındaki tam sayılar için kullanılır)
- long (64 bit)
- Byte.MIN_VALUE ve Byte.MAX_VALUE 
- Short.MIN_VALUE ve Short.MAX_VALUE 
- Integer.MIN_VALUE ve Integer.MAX_VALUE 
- Long.MIN_VALUE ve Long.MAX_VALUE

#### Ondalıklı Sayı Veri Tipleri

- float (32 bit) (Mutlaka sayının sonuna "f" koyulur)
- double (64 bit)

- char (char isim = 'A')
- boolean true ve false

### Matematik Değerler:
- n%2==0 ÇİFT
- n%2==1 TEK
- Karekök alma: Math.sqrt
- Üstlü sayı: Math.pow(a,2) (a üzeri 2)

### String
- String yazi = "Yazı"

## Temel Operatörler

### Karşılaştırma Operatörleri

**Boolean ile kullanılırlar.**
- == Eşittir

**String için equals.(")**
- != Eşit değildir
- (>) Büyüktür
- (<) Küçüktür
- (>=) Büyük eşittir
- (<=) Küçük eşittir
- && ve anlamına gelir
- || veya anlamına gelir
- ! Verinen başına koyularak **Değil** ifadesi yaratılır.
- ? : (Doğru veya Yanlış) Örnek: String cevap = ? "Doğru" : "Yanlış";

### IF - ELSE
- if(){

} else if (){

} else{

}
### SWITCH - CASE
- switch () {

  case1:

    sout

    break;

  case2:

    sout

    break;
  
  default:
}

## Kullanıcıdan Veri Alma
- import java.util.Scanner; kodu en tepeye yazılır.
- Scanner input = new Scanner(System.in); kodu eklenir.
  
   input.next sistemi ile objeye atama yapılır. 

input.nextint()    input.nextdouble()       input.nextbyte() vb.

String için; input.nextline() kodu kullanılır.
             object.Equals() ile eşitlik aranır.

## DÖNGÜLER
### Calisma.While
- while(kosul){}
### Do Calisma.While
- do {kodlar}

  while(kosul);
### For
- for (a=1;a<n;a++){}