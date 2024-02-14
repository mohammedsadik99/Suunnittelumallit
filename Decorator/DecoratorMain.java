public class DecoratorMain {
    public static void main(String[] args) {
        AccessControl accessControl = new AccessControl("salasana123");
        DataStructure dataStructure = new DataStructure();
        AccessControlDecorator decorator = new AccessControlDecorator(accessControl);
        decorator.accessSensitiveData(dataStructure);
    }
}
