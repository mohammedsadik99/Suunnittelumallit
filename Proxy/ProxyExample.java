class ProxyExample {
    public static void main(final String[] arguments) {
        PhotoFolder photoFolder = new PhotoFolder();
        photoFolder.addPhoto(new ProxyImage("HiRes_10MB_Photo1"));
        photoFolder.addPhoto(new ProxyImage("HiRes_10MB_Photo2"));

        photoFolder.showContents();
        System.out.println("---");

        photoFolder.displayPhoto(0); // loading necessary
        photoFolder.displayPhoto(0); // loading unnecessary
        photoFolder.displayPhoto(1); // loading necessary
        photoFolder.displayPhoto(1); // loading unnecessary
        photoFolder.displayPhoto(0); // loading unnecessary
    }
}
