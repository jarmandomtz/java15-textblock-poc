package com.esausi.poc.textbloc;

public class TextBlockMain {
    public static void main(String args[]){
        System.out.println("Text block poc");

        var myText = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vel tincidunt lorem, egestas viverra mi. Pellentesque consectetur, sem placerat laoreet rhoncus, augue leo aliquet massa, non ultrices dolor felis et ante. Nulla sed nisl blandit, dapibus nulla id, hendrerit elit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nunc sed ligula porttitor, suscipit erat non, elementum mauris. Aenean vestibulum malesuada diam, sit amet rutrum ligula tristique congue. Quisque gravida convallis massa. Sed scelerisque eros id enim aliquam, eget mollis quam convallis. Proin non ullamcorper tellus. Donec at consectetur odio. Pellentesque felis purus, maximus ut consectetur id, volutpat vel nulla. Aenean purus felis, pulvinar in nisi vitae, varius scelerisque ligula.
                                
                Aliquam faucibus id justo quis lobortis. Nulla facilisi. Etiam auctor, lacus vitae ullamcorper venenatis, ante magna condimentum dolor, vitae molestie mi arcu et neque. Pellentesque cursus, augue ut pulvinar placerat, nisl tellus vehicula mi, sit amet tincidunt dolor neque a lectus. Fusce lacinia posuere mi. Nunc pellentesque diam ex, eget egestas justo sodales et. In interdum eros odio, pulvinar commodo lacus scelerisque sed. Cras at auctor tellus. Nulla ac mi turpis. Quisque nec rutrum dolor. Etiam luctus quis diam vel tincidunt. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Suspendisse purus tellus, fermentum eu fermentum nec, scelerisque in magna. Aenean malesuada, libero nec finibus accumsan, velit sapien aliquet sem, et accumsan sapien ipsum vitae dolor.
                                
                Cras eget sollicitudin tortor, at suscipit leo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Pellentesque eget magna iaculis nisl ultricies ullamcorper in vel ante. Sed convallis nulla id interdum fermentum. Cras pharetra lacus ac dignissim mollis. Pellentesque ut vehicula ipsum, ornare scelerisque dui. Nunc arcu dui, convallis nec mi nec, congue rhoncus ligula. Nam vulputate massa sed justo sollicitudin consequat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vivamus mattis lacus eget lacus euismod, sit amet mattis diam molestie.
                                
                Nunc vitae volutpat est. Nunc in enim sollicitudin, fringilla velit sed, commodo tellus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nullam ac lobortis tellus. Duis porttitor tristique auctor. Duis ultricies, tortor sit amet imperdiet iaculis, nulla elit rutrum purus, ut ultricies mi ex in ligula. Proin finibus nisl vel nisi pretium, ut efficitur leo euismod. Phasellus vel velit turpis. Mauris velit felis, interdum sed velit eget, condimentum dictum neque. Aliquam cursus, augue at sollicitudin euismod, justo sapien maximus ipsum, sed ullamcorper nisl mi aliquet elit. Proin eu neque dignissim, tincidunt dui non, iaculis enim.
                                
                Suspendisse eu enim id dolor lacinia tempus. Etiam mollis sem eu elementum accumsan. Curabitur quis orci tortor. Aliquam hendrerit pellentesque urna at finibus. In finibus condimentum tincidunt. Ut accumsan, mauris in vulputate fermentum, metus ex convallis elit, nec tempor odio neque a nisl. Nullam in tincidunt quam. In mi est, ornare ut molestie at, tempus vitae mi. Suspendisse nec enim non arcu rutrum posuere.
                """;
        System.out.println("************************************ORIGINAL*****************************************");
        System.out.println(myText);
        System.out.println("************************************MODIFIED*****************************************");
        System.out.println(myText.substring(0, myText.indexOf("\n")));
        System.out.println("*************************************************************************************");
    }
}
