package Classes;

public class Reply
{
    public Reply (String reply, boolean esatto)
    {
        this.reply=reply;
        this.esatto=esatto;
    }


    private String reply;

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public boolean isEsatto() {
        return esatto;
    }

    public void setEsatto(boolean esatto) {
        this.esatto = esatto;
    }

    private boolean esatto;

}
