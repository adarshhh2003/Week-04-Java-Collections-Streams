package annotations.advancedlevel.roleallowedannotation;

import java.lang.reflect.Method;

class AccessControl {
    private String currentUserRole;

    public AccessControl(String role) {
        this.currentUserRole = role;
    }

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully.");
    }

    public void executeTask(String methodName) {
        try {
            Method method = this.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                if (!roleAllowed.value().equals(currentUserRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }
            method.invoke(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}