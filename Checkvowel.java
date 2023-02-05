class Checkvowel
{
   public static void vowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("character is vowel");
        }
        else 
        {
            System.out.println("character is consonant");
        }
    }
    public static void main(String[] args) {
        vowel('j');
    }
}