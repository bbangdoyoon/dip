package my.com.dip.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
		//private MemberDao memberDao = new memberdao(); 하면 메모리 낭비
	public void newMember(MemberDto memberDto) {
		// 입력한 email이 존재하는지 확인
		// 없으면 data추가
		// 있으면 data에 넣을 수 없다. 이미 중복
		
		// 있는지 확인하는 메소드
		// memberDao.getSelectbyEmail(memberDto.getEmail());
		
		//추가 하는 메소드
		memberDao.insert(memberDto);
	}
	
	public void printMember() {
		memberDao.selectall()
				.forEach(m -> System.out.println(m));
	}

}
