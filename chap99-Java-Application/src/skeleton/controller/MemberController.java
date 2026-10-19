package skeleton.controller;

import skeleton.model.Member;
import skeleton.model.MembershipType;
import skeleton.repository.GymDatabase;
import skeleton.view.MemberView;

import java.time.LocalDateTime;
import java.util.List;

// 요청 흐름 조정
public class MemberController {

    private final GymDatabase gymDatabase;
    private final MemberView memberView;

    //의존성 주입.
    public MemberController() {
        gymDatabase = new GymDatabase();//private니까 객체생성.
        memberView = new MemberView();
    }

    /*
     * 문제 CONTROLLER-1. 신규 회원 등록 요청 처리
     *
     * LocalDateTime.now()로 구한 현재 날짜와 시각을 가입일로 저장한다.
     * 가입일에 plusDays()로 membershipType.getDays()를 더해 만료일을 계산한다.
     * ID는 데이터베이스에서 부여하므로 0으로 설정한 활성 Member를 생성한다.
     * 데이터베이스에 추가한 뒤 "회원이 성공적으로 등록되었습니다."를 출력한다.
     */
    public void addMember(String name, int age, String phone, MembershipType membershipType) {
        // TODO: 위 요구사항에 맞게 등록 요청 처리 코드를 작성하세요.

        LocalDateTime enrollDate = LocalDateTime.now();
        LocalDateTime expriayDate = enrollDate.plusDays(membershipType.getDays());
        Member member = new Member(0, name, age, phone, membershipType, enrollDate, expriayDate, true);

        //데이터베이스에 추가.
        gymDatabase.addMember(member);//아직 db쪽 메소드는 완성되지 않음.

        memberView.displayMessage("회원이 성공적으로 등록되었습니다");


    }

    /*
     * 문제 CONTROLLER-2. 전체 회원 조회 요청 처리
     *
     * 데이터베이스에서 전체 회원 목록을 가져온다.
     * 가져온 목록을 MemberView의 목록 출력 메소드로 전달한다.
     */
    public void displayAllMembers() {
        // TODO: 전체 회원 조회 결과를 화면에 전달하세요.
        List<Member> members; //데이터베이스의 호출하려는 반환타입의 변수선언.
        members = gymDatabase.getAllMembers();//변수에 값을 넣는다. //호출하려는 클래스의 해당 기능을 가지고 온다.
        memberView.displayMemberList(members);//멤버뷰의 매개변수가 맞는 타입의 메서드로 보낸다.


    }

    /*
     * 문제 CONTROLLER-3. 회원 ID 조회 요청 처리
     *
     * 데이터베이스에서 memberId와 일치하는 회원을 조회한다.
     * 회원이 있으면 회원 정보를 출력한다.
     * 회원이 없으면 "해당 ID의 회원을 찾을 수 없습니다."를 출력한다.
     */
    public void getMember(int memberId) {
        // TODO: ID 조회 결과에 따라 회원 또는 안내 메시지를 출력하세요.

        Member member = gymDatabase.getMember(memberId);

        if (member != null) {
            memberView.displayMember(member);
        } else {
            memberView.displayMessage("해당 ID의 회원을 찾을 수 없습니다");
        }


    }

    /*
     * 문제 CONTROLLER-4. 회원 이름 조회 요청 처리
     *
     * 데이터베이스에서 name이 포함된 회원 목록을 조회한다.
     * 목록이 비어 있지 않으면 회원 목록을 출력한다.
     * 목록이 비어 있으면 "해당 이름의 회원을 찾을 수 없습니다."를 출력한다.
     */
    public void getMembersByName(String name) {
        // TODO: 이름 조회 결과에 따라 목록 또는 안내 메시지를 출력하세요.

        List<Member> member = gymDatabase.getMembersByName(name);

        if (member != null) {
            memberView.displayMemberList(member);
        } else {
            memberView.displayMessage("해당 이름의 회원을 찾을 수 없습니다");
        }


    }

    /*
     * 문제 CONTROLLER-5. 만료 예정 회원 조회 요청 처리
     *
     * 데이터베이스에서 7일 이내 만료 예정 회원 목록을 조회한다.
     * 결과가 있으면 제목 "=== 7일 이내 만료 예정 회원 목록 ==="과 목록을 출력한다.
     * 결과가 없으면 "만료 예정인 회원이 없습니다."를 출력한다.
     */
    public void getNearExpiryMembers() {
        // TODO: 만료 예정 조회 결과에 따라 목록 또는 안내 메시지를 출력하세요.

        //호출하려는 클래스의 반환 타입 변수 선언.
        //변수에 값을 넣어야지. 무슨 값? 호출하려는 클래스의 값.
        List<Member> member;
        member = gymDatabase.getNearExpiryMembers(); //7일 이내 회원목록조회.

        if (member != null) {

            memberView.displayMessage("=== 7일 이내 만료 예정 회원 목록 ===");

            for(Member m : member) {
                System.out.println(m);
            }

        } else {
            memberView.displayMessage("만료 예정인 회원이 없습니다");
        }


    }

    /*
     * 문제 CONTROLLER-6. 회원 기본 정보 수정 요청 처리
     *
     * 먼저 memberId에 해당하는 회원의 존재 여부를 확인한다.
     * 회원이 있으면 데이터베이스의 수정 메소드를 호출하고
     * "회원 정보가 수정되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     */
    public void updateMemberInfo(int memberId, String name, int age, String phone) {
        // TODO: 회원 존재 여부에 따라 수정 또는 실패 처리를 작성하세요.
        //회워정보 수정하라고.

        Member member;
        member = gymDatabase.getMember(memberId);

        if (member != null) {
            gymDatabase.updateMemberInfo(memberId, name, age, phone);
            memberView.displayMessage("회원정보가 수정되었습니다");
        } else {
            memberView.displayMessage("회원 정보가 존재하지 않습니다");
        }


    }


    /*
     * 문제 CONTROLLER-7. 회원권 연장 요청 처리
     *
     * 회원이 있으면 데이터베이스의 연장 메소드를 호출하고
     * "회원권이 연장되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     */
    public void extendMembership(int memberId) {
        // TODO: 회원 존재 여부에 따라 연장 또는 실패 처리를 작성하세요.

        Member member;
        member =
                gymDatabase.getMember(memberId);

        if (member != null) {
            memberView.displayMessage("회원권이 연장되었습니다");
        } else {
            memberView.displayMessage("회원정보가 존재하지 않습니다");
        }

        gymDatabase.extendMembership(memberId);
        memberView.displayMessage("회원권이 연장되었습니다");

    }

    /*
     * 문제 CONTROLLER-8. 회원권 종류 변경 요청 처리
     *
     * 회원이 있으면 데이터베이스의 회원권 변경 메소드를 호출하고
     * "회원권 종류가 변경되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     */
    public void changeMembershipType(int memberId, MembershipType newType) {
        // TODO: 회원 존재 여부에 따라 회원권 변경 또는 실패 처리를 작성하세요.

        Member member;
        member =
                gymDatabase.getMember(memberId);

        if (member != null) {
            gymDatabase.changeMembershipType(memberId, newType);
            memberView.displayMessage("회원권 종류가 변경되었습니다");
        } else {
            memberView.displayMessage("회원 정보가 존재하지 않습니다");
        }

    }

    /*
     * 문제 CONTROLLER-9. 회원 상태 변경 요청 처리
     *
     * 회원이 있으면 데이터베이스의 상태 변경 메소드를 호출하고
     * "회원 상태가 변경되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     */
    public void updateMemberStatus(int memberId, boolean active) {
        // TODO: 회원 존재 여부에 따라 상태 변경 또는 실패 처리를 작성하세요.
        //호출하려는 클래스의 메서드 타입을 확인. -> 타입의 변수를 선언. -> 변수에 값을 넣기 -> 해당 작업을 할 코드를.

        Member member;
        member =
                gymDatabase.getMember(memberId);

        if (member != null) {
            gymDatabase.updateMemberStatus(memberId, active);
            memberView.displayMessage("회원상태가 변경되었습니다");
        } else {
            memberView.displayMessage("회원 정보가 존재하지 않습니다");
        }

    }

    /*
     * 문제 CONTROLLER-10. 회원 삭제 요청 처리
     *
     * 회원이 있으면 데이터베이스의 삭제 메소드를 호출하고
     * "회원이 삭제되었습니다."를 출력한다.
     * 회원이 없으면 ID 조회 실패 메시지를 출력한다.
     */
    public void deleteMember(int memberId) {
        // TODO: 회원 존재 여부에 따라 삭제 또는 실패 처리를 작성하세요.
        Member member;
        member =
                gymDatabase.getMember(memberId);

        if (member != null) {
            gymDatabase.deleteMember(memberId);
            memberView.displayMessage("회원이 삭제되었습니다");

        } else {
            memberView.displayMessage("회원 정보가 존재하지 않습니다");
        }

    }
}
