## Garbage Collection
Bu proje, Java'da Garbage Collection (Çöp Toplama) mekanizmasının nasıl çalıştığını göstermektedir. Garbage Collection, artık kullanılmayan nesnelerin bellekten otomatik olarak temizlenmesini sağlar. Bu proje, Garbage Collection'ın nasıl çalıştığını anlamak için bir dizi örnek içermektedir.

## Fruit Sınıfı
Fruit sınıfı, meyve nesnelerini temsil eder. Her meyve bir isme sahiptir.

- name: Meyvenin adını tutar.
- getName(): Meyvenin adını döndürür.
- setName(): Meyvenin adını ayarlar.
- finalize(): Java'nın Garbage Collector'ünün bir nesneyi toplamadan önce çağırdığı yöntem. Bu projede, meyve nesnesinin silindiğini belirten bir mesaj yazdırır.

## GarbageCollection Sınıfı
main metodu, Garbage Collection mekanizmasının nasıl çalıştığını gösteren bir dizi işlemi gerçekleştirir.

- Fruit sınıfından f1 adında bir meyve nesnesi oluşturulur ve adı "Elma" olarak ayarlanır. Bu nesne, daha sonra referansı null yapılacak bir örnek oluşturur.
- f1'in referansı null yapılır ve bu nesne artık kullanılamaz hale gelir. Ancak, bu nesnenin hala bellekte yer kapladığı gözlemlenebilir.
- f2 ve f3 adında iki meyve nesnesi daha oluşturulur. Daha sonra, f2'nin referansı f3'ün referansına eşitlenir. Bu durumda, artık f2'nin referansı kullanılamaz hale gelir ve bu nesne artık Garbage Collection tarafından toplanmayı bekler.
- Anonim bir meyve nesnesi oluşturulur. Bu nesnenin referansı yoktur ve bu nesne hemen Garbage Collection tarafından toplanır.
- f4 adında başka bir meyve nesnesi oluşturulur. Daha sonra, f3 ve f2'nin referansları f4'ün referansına eşitlenir. Bu durumda, artık f4'ün referansı kullanılmaz hale gelir.
- f4, f3 ve f2'nin referansları null yapılır ve bu nesneler Garbage Collector tarafından toplanmayı bekler.
- System.gc() çağrısı ile Garbage Collector'ün anında çalıştırılması sağlanır.

## Çalıştırma
Projeyi çalıştırmak için GarbaceCollection sınıfını çalıştırın. İlgili işlemler ardışık olarak gerçekleştirilir ve her bir adımda Garbage Collector'ün çalışması gözlemlenebilir.

## Dikkat Edilmesi Gereken Noktalar
- Garbage Collector, artık kullanılmayan nesneleri otomatik olarak toplar ve belleği boşaltır.
- finalize() yöntemi, bir nesne toplanmadan önce çağrılır, ancak nesnenin ne zaman toplanacağını ve ne zaman çağrılacağını garanti etmez.
- Garbage Collection, bellek yönetimini kolaylaştırır ve hafıza sızıntılarını önler.
