public class dupchar {


        public static void main(String[] args){
            String str="Hello World";
            int count;

            char arra[]= str.toCharArray();
            for(int I=0; I<arra.length; I++){
                count=1;
                for(int j=I+1;j<arra.length;j++){
                    if(arra[I]==arra[j]&&arra[I]!=' '){
                        count++;
                        arra[j]='0';
                    }
                }
                if(count>1&& arra[I]!='0')
                System.out.println(arra[I]);
            }
        }

    }


