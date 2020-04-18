import java.util.Stack;

public class test {
    public  void main(String[] args) {

        String expre = "ln(2^(6-2*2)*5-6)/2";
        String ans;

        ans = posrfix(expre);

        System.out.println(ans);
        compute(ans);
    }

    public  int prio(char a){
        int priority_a=0;
        switch (a){
            case '+':
                priority_a = 0;
                break;
            case '-':
                priority_a = 0;
                break;
            case '*':
                priority_a = 1;
                break;
            case '/':
                priority_a = 1;
                break;
            case '^':
                priority_a = 2;
                break;
            case 's':
                priority_a = 3;
                break;
            case 'c':
                priority_a = 3;
                break;
            case 't':
                priority_a = 3;
                break;
            case 'l':
                priority_a = 3;
                break;
        }

        return  priority_a;
    }
    
    public  String posrfix(String exp) {

        StringBuilder postfix = new StringBuilder();
        Stack<Character> opt = new Stack();
        char [] c = exp.toCharArray();

        //遍历中缀表达式，请查看上面的规则
        for (int i=0;i<c.length;i++) {
            if (isNum(c[i])){
                postfix.append(c[i]);
                int flag = i;
                //如果当前字符为数字且下一位不数字，或当前数字已是中缀表达式字符串最后一位，在多位数后添加" "来分隔
                if ( (i < c.length-1&&!isNum(c[flag+1]))|| i == c.length-1)
                    postfix.append(" ");
                continue;
            }


            if (c[i]=='e'||c[i]=='E'){
                postfix.append('e');
                postfix.append(" ");
                continue;
            }
            if (c[i]=='π'||c[i]=='Π'){
                postfix.append('π');
                postfix.append(" ");
                continue;
            }

            if (c[i]=='l'&&c[i+1]=='n'){
                while (!opt.isEmpty()&&(prio(opt.peek())>prio(c[i]))){
                    postfix.append(opt.pop());
                }
                opt.push(c[i]);
                i+=1;
                continue;
            }

            if (c[i]=='^'){
                while (!opt.isEmpty()&&(prio(opt.peek())>prio(c[i]))){
                    postfix.append(opt.pop());
                }
                opt.push(c[i]);
                continue;
            }

            if (c[i]=='s'&&c[i+1]=='i'&&c[i+2]=='n'){
                while (!opt.isEmpty()&&(prio(opt.peek())>prio(c[i]))){
                    postfix.append(opt.pop());
                }
                opt.push(c[i]);
                i+=2;
                continue;
            }
            if (c[i]=='c'&&c[i+1]=='o'&&c[i+2]=='s'){
                while (!opt.isEmpty()&&(prio(opt.peek())>prio(c[i]))){
                    postfix.append(opt.pop());
                }
                opt.push(c[i]);
                i+=2;
                continue;
            }
            if (c[i]=='t'&&c[i+1]=='a'&&c[i+2]=='n'){
                while (!opt.isEmpty()&&(prio(opt.peek())>prio(c[i]))){
                    postfix.append(opt.pop());
                }
                opt.push(c[i]);
                i+=2;
                continue;
            }

            if (c[i]=='('){
                opt.push(c[i]);
                continue;
            }

            if (c[i]=='*'||c[i]=='/'){
                while (!opt.isEmpty()&&(prio(opt.peek())>prio(c[i]))){
                    postfix.append(opt.pop());
                }
                opt.push(c[i]);
                continue;
            }

            if (c[i]==')'){
                while ((!opt.isEmpty())) {
                    if (opt.peek()=='('){
                        opt.pop();
                        break;
                    }
                    postfix.append(opt.pop());
                }
                continue;
            }
            if (c[i]=='+'||c[i]=='-'){
                while ((!opt.isEmpty())&&opt.peek()!='('){
                    postfix.append(opt.pop());
                }
                opt.push(c[i]);
                continue;
            }
        }

        //当遍历完中缀表达式，把此时符号栈的元素弹出，添加到后缀表达式
        while (!opt.isEmpty()){
            postfix.append(opt.pop());
        }
        return postfix.toString();

    }

    public  boolean isNum(char c){
        return ( c>=48 && c<=57 )|| c=='.';
    }

    public  void compute(String expression) {
        Stack<Double> num = new Stack<>();
        StringBuilder  sb = new StringBuilder();
        char[] c = expression.toCharArray();
        for (int i = 0;i< c.length;i++) {
            if (isNum(c[i])) {
                sb.append(c[i]);
                //如果当前字符已经是表达式字符串最后一位，直接放入操作数栈
                if (i+1 == c.length) {
                    num.push(Double.parseDouble(sb.toString()));
                    continue;
                }
                //判断是否为多位数，如果当前字符下一位为设置的" "标记,就截取到当前字符
                if (c[i+1]==" ".charAt(0)) {
                    num.push(Double.parseDouble(sb.toString()));
                    sb.delete(0,sb.length());
                    continue;
                }
                continue;
            }
            if (c[i]=='e'){
                num.push(Math.E);
            }
            if (c[i]=='π'){
                num.push(Math.PI);
            }
            if (c[i]=='+') {
                num.push(num.pop()+num.pop());
            }
            if (c[i] == '-') {
                double num1 = num.pop();
                double num2 = num.pop();
                num.push(num2-num1);
            }
            if (c[i] == '*') {
                num.push(num.pop()*num.pop());
            }
            if (c[i] == '/') {
                double num1 = num.pop();
                double num2 = num.pop();
                num.push(num2/num1);
            }
            if (c[i] == '^'){
                double num1 = num.pop();
                double num2 = num.pop();
                num.push(Math.pow(num2,num1));
            }

            if (c[i] == 'l'){
                double num1 = num.pop();
                num.push(Math.log(num1));
            }

            if (c[i] == 's'){
                double num1 = num.pop();
                num.push(Math.sin(num1));
            }
            if (c[i] == 'c'){
                double num1 = num.pop();
                num.push(Math.cos(num1));
            }
            if (c[i] == 't'){
                double num1 = num.pop();
                num.push(Math.tan(num1));
            }
        }
        //扫面完后缀表达式，操作数栈只剩下一个元素，就是计算的结果
        System.out.println("result is ："+num.pop());
    }
}
