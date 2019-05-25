package cn.wildfirechat.common;

public interface APIPath {
    String Create_Chatroom = "/admin/chatroom/create";
    String Chatroom_Destroy = "/admin/chatroom/del";
    String Chatroom_Info = "/admin/chatroom/info";


    String Sensitive_Add = "/admin/sensitive/add";
    String Sensitive_Del = "/admin/sensitive/del";
    String Sensitive_Query = "/admin/sensitive/query";

    String Create_User = "/admin/user/create";
    String Create_Robot = "/admin/robot/create";
    String User_Get_Token = "/admin/user/get_token";
    String User_Update_Block_Status = "/admin/user/update_block_status";
    String User_Get_Info = "/admin/user/get_info";
    String User_Get_Blocked_List = "/admin/user/get_blocked_list";
    String User_Check_Block_Status = "/admin/user/check_block_status";
    String User_Get_Online_Status = "/admin/user/onlinestatus";


    String Friend_Update_Status = "/admin/friend/status";
    String Friend_Get_List = "/admin/friend/list";

    String Msg_Send = "/admin/message/send";
    String Msg_Recall = "/admin/message/recall";

    String Create_Group = "/admin/group/create";
    String Group_Dismiss = "/admin/group/del";
    String Group_Transfer = "/admin/group/transfer";
    String Group_Get_Info = "/admin/group/get_info";
    String Group_Member_List = "/admin/group/member/list";
    String Group_Member_Add = "/admin/group/member/add";
    String Group_Member_Kickoff = "/admin/group/member/del";


    String Channel_Message_Send = "/channel/message/send";

    String Robot_User_Info = "/robot/user_info";
    String Robot_Message_Send = "/robot/message/send";
}
