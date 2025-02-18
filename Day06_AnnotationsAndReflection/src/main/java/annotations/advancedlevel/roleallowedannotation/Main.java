package annotations.advancedlevel.roleallowedannotation;

public class Main {
    public static void main(String[] args) {
        AccessControl adminUser = new AccessControl("ADMIN");
        adminUser.executeTask("adminTask"); // Should execute successfully

        AccessControl normalUser = new AccessControl("USER");
        normalUser.executeTask("adminTask"); // Should print "Access Denied!"
    }
}