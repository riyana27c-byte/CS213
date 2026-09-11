//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final int n = 10;
    int a = 0;
    int b = 1;

    for(int i = 0; i < 10; i++){
        System.out.print (a);
        int next = a + b;
        a = b;
        b = next;
    }
}
