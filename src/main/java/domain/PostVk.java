package domain;

public class PostVk {
    private int id;  // айди поста
    private int ownerId;//идентификатор владельца стены, на которой размещена запись
    private int fromId; //идентификатор автора записи (от чьего имени опубликована запись)
    private int createdBy;//идентификатор администратора, который опубликовал запись
    private String date; //дата
    private String time; //время
    private String text; // текст
    private int replyOwnerId;//идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;//идентификатор записи, в ответ на которую была оставлена текущая.
    private boolean friendsOnly; //запись только для друзей?

    private CommentsInfo commentsInfo; // блок с комментариями

    private String copyright; //копирайт

    private LikesInfo likesInfo; // блок с лайками

    private RepostsInfo repostsInfo; // блок с репостами

    private long viewersCount; //кол-во просмотров
    private String postType; //тип поста
    private boolean attachImage; //в пост добавлена картинка
    private String imageUrl; //урл картинок
    private boolean attachDoc; //в пост добавлен документ
    private String docUrl; //урл документа
    private boolean attachAudio; //в пост добавлена аудиозапись
    private boolean attachVideo; //в пост добавлена видеозапись
    private String geo; //местоположение
    private int signerId;//идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private boolean subscribe; // вы подписаны на автора поста?
    private boolean pin; //пост закреплен?
    private boolean canDelete; //информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; //информация о том, может ли текущий пользователь редактировать запись
    private boolean canPin; //информация о том, может ли текущий пользователь закрепить запись
    private boolean markedAsAds; // реклама?
    private boolean sFavorite; // в закладках у текущего юзера
    private boolean postponedId; // отложенный пост?
    private  String userPicUrl; // урл юзерпика автора поста
    private String communityPicUrl; //урл юзерпика сообщества
    private String[] sortCommentInfo; //блок комментарием отсортирован как? сначала: интересные, старые, новые










}
