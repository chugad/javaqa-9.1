package domain;

public class PostVk {
    private long id;  // айди поста
    private boolean pin; //пост закреплен?
    private String date; //дата
    private String time; //время
    private String text; // текст
    private boolean attachImage; //в пост добавлена картинка
    private String imageUrl; //урл картинок
    private boolean attachDoc; //в пост добавлен документ
    private String docUrl; //урл картинок
    private long likesCount; //кол-во лайков
    private long commentCount; //кол-во комментов
    private long viewersCount; //кол-во просмотров
    private boolean userOrCommunity; //пост написан на личной странице пользователя или на странице сообщества
    private long userId; //айди юзера, который написал пост
    private long communityId; //айди сообщества в котором был написан пост
    private boolean subscribe; // вы подписаны на автора поста?
    private  String userPicUrl; // урл юзерпика автора поста
    private String communityPicUrl; //урл юзерпика сообщества
    private long repostCount; //кол-во репостов
    private String[] sortCommentInfo; //блок комментарием отсортирован как? сначала: интересные, старые, новые
    private CommentsInfo[] CommentsInfo; // блок с комментариями

}
