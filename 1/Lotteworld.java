import java.util.Scanner;

public class Lotteworld {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("'어서오세요. 여기는 환상의 나라 롯데월드입니다!!'\n");
		System.out.println("타려는 놀이기구를 선택해 주세요!!\n");

		System.out.println("1. 혜성특급! "); 
		System.out.println("2. 고공파도타기!!"); 
		System.out.println("3. 아틀란티스!!!"); 
		System.out.println("4. 아크 어드벤처 !!!!(번호를 입력 해주세요)"); 

		number = input.nextInt();

		if(number == 1) {
			System.out.println("당신은 혜성특급에서 억울하게 죽은 롯데월드 혜성특급 알바생 귀신에 의해 죽음을 맞이하였습니다.");

		}
		else if(number == 2) {
			System.out.println("당신은 노후된 기구로 인한 사고로 석촌호수에 빠져 죽음을 맞이하였습니다.");

		}
		else if(number == 3) {
			System.out.println("당신은 술먹고 안전바를 제대로 착용하지 않은 사고로 인하여 석촌호수에 빠져 죽음을 맞이하였습니다.");

		}
		else if(number == 4) {
			System.out.println("당신은 실존하지 않는 아크 어드벤쳐를 탄 후 영원한 죽음을 맞이하였습니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'으악!! 뭐지? 아... 오늘 롯데월드 가는데 별 이상한 꿈을 다 꾸네 ...'\n");

		System.out.println("'엇 벌써 시간이 8시야?? 아 큰일났다!! 늦잠 자버렸네.. 얼렁 준비해야 해 ㅜㅠ 어떡하지?'\n");

		System.out.println("1. 옷만 입고 바로 나가자!"); 
		System.out.println("2. 머리만 감고 가자!!"); 
		System.out.println("3. 샤워만 하고 가자!!!"); 
		System.out.println("4. 목욕하고 꽃단장까지 하고 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("당신은 눈꼽 끼고 머리 떡진 채로 나가 사람들이 다가오지 않을 것 입니다.");

		}
		else if(number == 2) {
			System.out.println("당신은 머리만 향기롭지 몸에서는 썩은 내가 나서 사람들이 다가오지 않을 것 입니다. ");

		}
		else if(number == 3) {
			System.out.println("당신은 샤워하느라 시간에 쫒기게 됩니다.");

		}
		else if(number == 4) {
			System.out.println("당신은 꽃단장까지 하느라 시간에 쫒기게 됩니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'얼른 옷 입고 빨리 나가야 해!! 근데 오늘 뭐 입지?'\n");

		System.out.println("1. 편하게 츄리닝차림으로 가즈아! "); 
		System.out.println("2. 롯데월드는 동물잠옷이지!!"); 
		System.out.println("3. 인연을 만날지 모르니 정장을 차려입자!!!"); 
		System.out.println("4. 더우니까 팬티만 입자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("당신은 편한 츄리닝을 입었습니다. 몸이 가볍습니다.");

		}
		else if(number == 2) {
			System.out.println("당신은 귀여운 동물잠옷을 입고 갑니다. 롯데월드 갈 때 까지 주변 사람들 눈치가 보입니다. ");

		}
		else if(number == 3) {
			System.out.println("당신은 정장에 넥타이까지 차려 입고 롯데월드를 갑니다.");

		}
		else if(number == 4) {
			System.out.println("당신은 롯데월드 가기도 전에 철컹철컹 할 수 있으니 조심하십시오.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}



		System.out.println("\n\n\n'롯데월드에 챙겨가야 할 준비물이 있나?'\n");

		System.out.println("1. 갈 때는 쪽팔리겠지만 작년에 샀던 동물 귀 머리띠를 쓰고가자! "); 
		System.out.println("2. 무서운거 타기 전 떨리니까 엄마의 우황청심환을 몰래 챙기자!!"); 
		System.out.println("3. 줄이 너무 길면 화장실 가기 아까우니까 기저귀를 차고 가자!!!"); 
		System.out.println("4. 지릴지 모르니 팬티를 하나 더 갖고가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("당신은 귀여운 토끼 머리띠를 출근길에 쓰고 가기에 조금 쪽 팔립니다.");

		}
		else if(number == 2) {
			System.out.println("당신은 고가의 우황청심환을 몰래 가져가려다 엄마한테 등짝을 맞습니다. ");

		}
		else if(number == 3) {
			System.out.println("당신은 조카의 기저귀를 몰래 입으려다 걸려 엄마한테 등짝을 맞습니다.");

		}
		else if(number == 4) {
			System.out.println("당신은 삼각팬티를 하나  챙기게 됩니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'그러고 보니깐 누구랑 같이 가지? '\n");

		System.out.println("1. 놀이공원은 애인과 함께 해야지! 애인이랑 같이 놀이동산 데이트 가즈아!"); 
		System.out.println("2. 고딩 친구가 최고지!! 고등학교 친구들이랑 가자!!"); 
		System.out.println("3. 대학 동기들이랑 가쟈 !!!"); 
		System.out.println("4. 누티 동아리원끼리 친목하자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("솔로인 당신. 애인이 없어서 혼자 가게 됩니다..");

		}
		else if(number == 2) {
			System.out.println("고등학교때 왕따였던 당신. 친구가 없어서 혼자 가게 됩니다.. ");

		}
		else if(number == 3) {
			System.out.println("대학교에 아는 사람 없는 아싸인 당신. 친구가 없어서 혼자 가게 됩니다..");

		}
		else if(number == 4) {
			System.out.println("누티는 스터디 동아리라 아무도 안놀아준다네요. 갈 친구가 없어서 혼자 가게 됩니다..");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'9시 반이 오픈인데 벌써 9시네... 뭐 타고 가지? '\n");

		System.out.println("1. 편하게 택시 불러서 빠르게 가즈아!"); 
		System.out.println("2. 출근시간이라 밀릴거야.. 지하철 타고 가자 !!"); 
		System.out.println("3. 버스 전용차선도 빠르다고.. 버스 타고 가자!!!"); 
		System.out.println("4. 돈 아끼게 걸어가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("빠르게 택시를 불렀지만 출근 시간과 겹쳐 오픈시간에 맞춰 도착하지 못했습니다.");

		}
		else if(number == 2) {
			System.out.println("출근하는 사람들과 함께 지옥철을 타고 잠실역에 내렸지만 오픈시간에 맞춰 도착하지 못했습니다. ");

		}
		else if(number == 3) {
			System.out.println("배차간격을 맞추지 못해 10분을 기다렸기에 오픈시간에 맞춰 도착하지 못했습니다.");

		}
		else if(number == 4) {
			System.out.println("당신은 롯데월드 가기도 전에 체력을 잃었으니 조심하십시오.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'조금 늦었다고 줄이 엄청나게 서있네.. 어떡할까? '\n");

		System.out.println("1. 어쩔수 없이 줄을 선다 !"); 
		System.out.println("2. 몰래 맨 앞으로 가서 새치기를 한다!!"); 
		System.out.println("3. 직원이 보기 전에 게이트를 몰래 기어 넘어간다!!!"); 
		System.out.println("4. 매직 아일랜드 앞 매표소로 가면 줄이 짦으니까 거기로 간다!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("줄 서는데 1시간이 걸렸습니다. ");

		}
		else if(number == 2) {
			System.out.println("맨 앞으로 갔지만 양심에 찔려 다시 뒤로 갔기에 줄 서는데 1시간이 걸렸습니다. ");

		}
		else if(number == 3) {
			System.out.println("기어가다 직원에게 걸려 개쪽 당하고 다시 뒤로 갔기에 줄 서는데 1시간이 걸렸습니다.");

		}
		else if(number == 4) {
			System.out.println("매직아일랜드 앞까지 땀 뻘뻘 흘리며 뛰어갔지만 이미 사람이 그 곳에도 많기에 줄 서는데 1시간 걸렸습니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'드디어 매표소 앞까지 왔다!! 어떤 입장권을 끊을까? '\n");

		System.out.println("1. 롯데월드는 당연히 자유이용권이지 !"); 
		System.out.println("2. 어차피 사람도 많은데 빅 5로 끊어서 들어가자!!"); 
		System.out.println("3. 놀이기구 못 탈 것 같은데 그냥 입장권 끊자!!!"); 
		System.out.println("4. 오전권만 끊고 5시쯤엔 집에 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("자유이용권을 결제하려 합니다. ");

		}
		else if(number == 2) {
			System.out.println("빅 5를 결제하려 합니다. ");

		}
		else if(number == 3) {
			System.out.println("입장권을 결제하려 합니다.");

		}
		else if(number == 4) {
			System.out.println("오전권을 결제하려 합니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'결제를 어떤걸로 하지? '\n");

		System.out.println("1. 신용카드로 하지 !"); 
		System.out.println("2. 현금으로 하자!!"); 
		System.out.println("3. 삼성페이로 결제하자!!!"); 
		System.out.println("4. 위조지폐로 결제하자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("신용카드로 결제하겠습니다. ");

		}
		else if(number == 2) {
			System.out.println("현금으로 결제하겠습니다. ");

		}
		else if(number == 3) {
			System.out.println("삼성페이로 결제하겠습니다.");

		}
		else if(number == 4) {
			System.out.println("직원이 눈치 채지 못한 듯 하다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'무슨 할인을 받을까? '\n");

		System.out.println("1. 예전 학생증으로 학생 할인을 받아보자 !"); 
		System.out.println("2. 그냥 귀찮으니까 정가 내자!!"); 
		System.out.println("3. 외국인 할인을 받아보자!!!"); 
		System.out.println("4. 장애인 할인을 받아보자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("나라사랑카드와 함께 학생증을 제시해서 걸리고 쪽을 당하고 맙니다. 정가로 내야 합니다 ");

		}
		else if(number == 2) {
			System.out.println("창렬스러운 롯데월드 정가로 결제하게 됩니다. ");

		}
		else if(number == 3) {
			System.out.println("직원이 유창한 외국어로 대화를 시도하기에 걸리고 정가로 계산하게 됩니다.");

		}
		else if(number == 4) {
			System.out.println("직원이 의심 없이 할인을 받아 줍니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'엇 축하합니다. 2018번째 손님이셔서 오늘 무료로 자유이용권 이용하실 수 있습니다. '\n");

		System.out.println("1. 감사합니다  !"); 
		System.out.println("2. 거절한다..내가 거진줄 알아!!"); 
		System.out.println("3. 롯데 신정빈 회장님 만세!!!"); 
		System.out.println("4. 오늘부터 꼴데 팬이야~~!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("무시 당한 채 무료 자유이용권으로 입장합니다. ");

		}
		else if(number == 2) {
			System.out.println("무료 자유이용권으로 입장합니다. ");

		}
		else if(number == 3) {
			System.out.println("무료 자유이용권으로 입장합니다.");

		}
		else if(number == 4) {
			System.out.println("무료 자유이용권으로 입장합니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'환영합니다!! 신비와 모험의 세계 롯데월드입니다!!♥ 혼자 오셨나요? '");
		System.out.println("\n알바생이 무안하게 혼자 왔냐고 묻는다... 뭐라 답해주지?\n");

		System.out.println("1. 네 전 외로운 솔로에요.. 오늘 알바 빼시고 같이 데이트 하시죠!"); 
		System.out.println("2. 내가 아싸인 줄 알아??"); 
		System.out.println("3. 무시한다!!!"); 
		System.out.println("4. 앗쌀라알라이쿰!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("당신은 알바에게 무시 당합니다. ");

		}
		else if(number == 2) {
			System.out.println("당신은 주변 사람들에게 아싸로 인식되게 됩니다. ");

		}
		else if(number == 3) {
			System.out.println("당신은 알바에게 속으로 동정받게 됩니다.");

		}
		else if(number == 4) {
			System.out.println("싸와디캅!!.. 태국어로 알바가 대화를 시도하기에 얼른 도망갑니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}



		System.out.println("\n\n\n'이제야 들어왔네... 먼저 어떤걸 타러 가 볼까나? '\n");

		System.out.println("1. 줄이 제일 길다는 후렌치 레볼루션을 먼저 타러 가자!"); 
		System.out.println("2. 자이로스윙으로 가자!!"); 
		System.out.println("3. 혜성특급을 타러 가자!!!"); 
		System.out.println("4. 바이킹을 먼저 타러 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 2) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 3) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");

		}
		else if(number == 4) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'줄이 너무 길다... 다른걸 타보자!! (다른 놀이기구를 타러 가시오) '\n");

		System.out.println("1. 줄이 제일 길다는 후렌치 레볼루션을 먼저 타러 가자!"); 
		System.out.println("2. 자이로스윙으로 가자!!"); 
		System.out.println("3. 혜성특급을 타러 가자!!!"); 
		System.out.println("4. 바이킹을 먼저 타러 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 2) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 3) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");

		}
		else if(number == 4) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'미쳤네..여기도 줄이 너무 길다... 다른걸 타보자!! (다른 놀이기구를 타러 가시오) '\n");

		System.out.println("1. 줄이 제일 길다는 후렌치 레볼루션을 먼저 타러 가자!"); 
		System.out.println("2. 자이로스윙으로 가자!!"); 
		System.out.println("3. 혜성특급을 타러 가자!!!"); 
		System.out.println("4. 바이킹을 먼저 타러 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 2) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 3) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");

		}
		else if(number == 4) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'뭐야 여기도 줄이 너무 길잖아... 다른걸 타보자!! (다른 놀이기구를 타러 가시오)'\n");

		System.out.println("1. 줄이 제일 길다는 후렌치 레볼루션을 먼저 타러 가자!"); 
		System.out.println("2. 자이로스윙으로 가자!!"); 
		System.out.println("3. 혜성특급을 타러 가자!!!"); 
		System.out.println("4. 바이킹을 먼저 타러 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 2) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다. ");

		}
		else if(number == 3) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");

		}
		else if(number == 4) {
			System.out.println("이미 오픈에 딱 맞추어 온 어마어마한 인파로 인해 1시간 반 줄을 서야 합니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'아 오늘 오픈시간 못 맞춰 왔다고 줄이 미쳤네 ㅜㅠ 벌써 12시인데 점심이나 먹자! 뭘 먹을까? '\n");

		System.out.println("1. 롯데월드는 롯데리아지 !"); 
		System.out.println("2. 롯데리아 안에 있는 푸드코트 짜장면이나 먹자!!"); 
		System.out.println("3. 그냥 츄러스나 먹고 줄 서러 가자!!!"); 
		System.out.println("4. 하나도 못타고 있는데 무슨 밥이야!!!! (번호를 입력 해주세요)");

		number = input.nextInt();
		if(number == 1) {
			System.out.println("맛없고 창렬스러운 롯데리아에서 8000원을 소비 합니다. ");

		}
		else if(number == 2) {
			System.out.println("짜파게티보다 질 낮은 짜장면을 먹고 7000원을 소비 합니다. ");

		}
		else if(number == 3) {
			System.out.println("원가 500원짜리 츄러스에 3500원을 소비 합니다.");

		}
		else if(number == 4) {
			System.out.println("아침도 못 먹은 당신. 놀이기구 탑승 시 멀미를 하게 될 확률이 증가합니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'이왕 왔는데 몇 개라도 타고 가아지!! 그냥 줄이 없는거 위주로 많이 타야겠다.. 어떤걸 타볼까? '\n");

		System.out.println("1. 아무도 안 타는 로티의 열기구를 타러 가자!"); 
		System.out.println("2. 풍선비행은 애들 타는거니까 줄이 없겠지? 거기로 가자!!"); 
		System.out.println("3. 혜성특급을 타러 가자!!!"); 
		System.out.println("4. 정글탐험보트를 먼저 타러 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("당신은 30분 주기로 상영하는 로티의 열기구를 1분 늦어 못 타게 됩니다. ");

		}
		else if(number == 2) {
			System.out.println("당신은 애들 놀이기구로 무시한 풍선비행의 줄이 롯데월드에서 제일 대기줄이 길다는 걸 깨닫게 됩니다. ");

		}
		else if(number == 3) {
			System.out.println("초등학교에서 단체로 현장학습을 왔는지 대기줄을 2시간 기다려야 합니다.");

		}
		else if(number == 4) {
			System.out.println("유치원에서 단체로 현장학습을 왔는지 대기줄을 2시간 기다려야 합니다.");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}


		System.out.println("\n\n\n'와 진짜 오늘 완전 무슨 날인가? 이러다 하나도 못 타고 가게 생겼네 ㅜㅠ '\n");
		System.out.println("'저 유령의 집은 5000원 내고 들어가는 거라 줄이 없네... 저거나 한번 들어가야 겠다!! '\n");
		System.out.println("'귀신의 집 퀄리티가 500원 줘도 안 들어가고 싶을 정도다... 어떡하지?  '\n");
		
		System.out.println("1. 귀신이 나타나면 놀란 척 5000원 어치 때리자 !"); 
		System.out.println("2. 어디 숨어서 귀신을 놀래켜보자!!"); 
		System.out.println("3. 5000원 돌려달라고 환불 요청을 하자!!!"); 
		System.out.println("4. 앞에 가는 꼴보기 싫은 커플들을 내가 귀신인 척 놀래켜 보자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("기다리던 귀신이 나타나 놀란 척 때려보았지만 철제 마네킹이었기에 주먹만 아픕니다. ");

		}
		else if(number == 2) {
			System.out.println("귀신이 점심먹으러 갔는지 나타나질 않아 시간만 날립니다. ");

		}
		else if(number == 3) {
			System.out.println("매표소가 무인 매표소라 어디 항의 할 곳이 없습니다.");

		}
		else if(number == 4) {
			System.out.println("분명히 앞에 닭살 커플들이 희미하게 있었는데 다가갈수록 보이질 않는다...");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("\n\n\n'아.. 괜히 들어가 가지고 5000원 날리고 찝찝하기까지 하고... 왠지 오늘 공짜로 들어오고 운수가 좋더니.. 그냥 집에 갈까?  '\n");

		System.out.println("1. 그래 어차피 공짜로 들어온 건데 그냥 집에 가서 잠이나 자자!"); 
		System.out.println("2. 아냐 이제 오후 2시 밖에 안됐는데 줄이 길더라도 하나라도 타고 가자!!"); 
		System.out.println("3. 한국민속촌이 공짜로 입장 가능하니까 그거라도 보러 가자!!!"); 
		System.out.println("4. 줄이 짧은 거라도 찾아보러 가자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("집으로 가서 잠이나 자려는 찰나에 누군가가 말을 겁니다. ");

		}
		else if(number == 2) {
			System.out.println("줄이 길더라도 하나라도 타러 가려는 찰나에 누군가가 말을 겁니다. ");

		}
		else if(number == 3) {
			System.out.println("한국 민속촌으로 가려는 찰나에 누군가가 말을 겁니다.");

		}
		else if(number == 4) {
			System.out.println("줄이 짧은거 하나라도 타러 가려는 찰나에 누군가가 말을 겁니다..");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("\n\n\n'저기 혹시 혼자 오셨나요?' 완전 내 스타일의 그(혹은 그녀)가 말을 건다!! 어떡하지?\n");

		System.out.println("1. 저 도를 믿지 않습니다!"); 
		System.out.println("2. 아 바로 그대가 솔로인 날 구원해줄 메시아인가요!!"); 
		System.out.println("3. 아뇨 저 친구 있어요.. 왕따 아닙니다 하하 친구가 먼저 간 것 뿐이에요!!!"); 
		System.out.println("4. 아뇨 혼자 아닌 약혼자 바로 당신과 함께 왔잖아요!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'네? 아니 저 그런 사람 아니고요.. 저기..그쪽 아까부터 혼자 다니신거 계속 지켜봐서 다 알아요..'");

		}
		else if(number == 2) {
			System.out.println("'네? 뭐라고요..ㅋㅋㅋ..저기..그쪽 아까부터 혼자 다니신거 다 알아요..'");

		}
		else if(number == 3) {
			System.out.println("'ㅋㅋㅋㅋㅋ.. 저기..그쪽 아까부터 혼자 다니신거 다 알거든요..'");

		}
		else if(number == 4) {
			System.out.println("'농담하시는거죠 ? ㅋㅋㅋ.. 저기..그쪽 아까부터 혼자 다니신거 다 알아요..'");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		
		System.out.println("\n\n\n'저도 혼자 왔는데.. 같이 다니면 안돼요?\n");

		System.out.println("1. 그럼요 당연하죠 네네!"); 
		System.out.println("2. 이거 혹시 신종 장기팔이 기술인가요?!!"); 
		System.out.println("3. 엄마가 모르는 사람 따라가지 말랬어요!!!"); 
		System.out.println("4. 도 안 믿는다니까요!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'ㅎㅎ 그러면 같이 재미있는 것 타러 가요!'");

		}
		else if(number == 2) {
			System.out.println("'진짜 아니에요 ㅋㅋㅋ..그러면 같이 재미있는 것 타러 가요!!'");

		}
		else if(number == 3) {
			System.out.println("'저희 엄마도 모르는 사람 따라가지 말랬는데... 오늘만 불효 해보죠!!!'");

		}
		else if(number == 4) {
			System.out.println("'진짜 도 믿으라 안한다니까요 ㅋㅋㅋ 오늘 하루만 같이 다녀요!!!!'");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		
		System.out.println("\n\n\n'그럼 같이 가는거죠?? 우선 음.. 바이킹 타러 가요!!\n");

		System.out.println("1. 바이킹 못타는데요.."); 
		System.out.println("2. 이미 그대 얼굴 바라보는 것 만으로도 제 심장이 바이킹을 타고 있어요!!"); 
		System.out.println("3. 바이킹 줄 엄청 길던데요 그냥 혼자 가시지!!!"); 
		System.out.println("4. 바이킹 좋죠 얼렁 갑시다!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'제가 손 꼭 잡고 타서 안 무섭게 해 드릴게요!'");

		}
		else if(number == 2) {
			System.out.println("'ㅋㅋㅋㅋ 이상한 소리 그만 하시고 얼렁 가요!!'");

		}
		else if(number == 3) {
			System.out.println("'이제 줄 좀 짧아졌을 거에요 얼렁 가요!!!'");

		}
		else if(number == 4) {
			System.out.println("'대신 줄 서는 동안 도에 대해 들어야 해요... ㅋㅋㅋ 농담이에요 얼렁 가요!!!!'");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		
		System.out.println("\n\n\n'바이킹에 다다르자 아까보다 더 줄이 길어져 있었다!!\n");

		System.out.println("1. 내가 이럴 줄 알았어.. 줄 길다 했잖아!"); 
		System.out.println("2. 이왕 줄이 이렇게 긴거 우리 밖으로 나가서 서로에 대해 더 알아가 볼까요??"); 
		System.out.println("3. 내가 너보고 혼자 가라고 했잖아!!!"); 
		System.out.println("4. 당신과 함께라면 이 줄이 300년이 걸린다 해도 좋아요!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'미안해요.. 음.. 대신에 제가 줄 기다릴 동안 재미있게 해드릴게요.. 같이 있어요 네? '");

		}
		else if(number == 2) {
			System.out.println("'안돼요 ㅜㅠ 저 롯데월드에서 나갈 수가 없어요... 음 그러니까 아직 많이 못 타서요 ㅎㅎ !!'");
			System.out.println("'미안해요.. 음.. 대신에 제가 줄 기다릴 동안 재미있게 해드릴게요.. 같이 있어요 네? '");

		}
		else if(number == 3) {
			System.out.println("'이제 줄 좀 짧아졌을 거에요 얼렁 가요!!!'");
			System.out.println("'미안해요.. 음.. 대신에 제가 줄 기다릴 동안 재미있게 해드릴게요.. 같이 있어요 네? '");
		}
		else if(number == 4) {
			System.out.println("'ㅎㅎ 그래도 줄 긴데 끌고와서 미안해요.. 음.. 대신에 제가 줄 기다릴 동안 재미있게 해드릴게요.. '");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("\n\n\n'음 그러면 어차피 기다리는 것 대화를 해보자!\n");

		System.out.println("1. 그쪽은 왜 혼자 오셨어요?"); 
		System.out.println("2. 그쪽은 혹시 애인 없으세요??"); 
		System.out.println("3. 그쪽은 혹시 몇 살이세요???"); 
		System.out.println("4. 성함이 어떻게 되세요???? (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'저도 혼자 있기 싫은데.. 하하 이렇게 됐네요.. '");
			System.out.println("왠지 모르게 이 사람 많이 외로워 보인다..");

		}
		else if(number == 2) {
			System.out.println("'그러게요.. 저도 그쪽과 같은 애인 사귀어서 이렇게 데이트 하고 싶었는데.. ㅎㅎ'");
			System.out.println("왠지 모르게 이 사람 어떤 사연이 있어 보인다..");
		}
		else if(number == 3) {
			System.out.println("'저요? 음 이번해가 2018년이니까... 15년 지났으니까 30대 중반인가???'");
			System.out.println("누가 봐도 20대 초반으로 보이는데.. 엄청난 동안인가?");
		}
		else if(number == 4) {
			System.out.println("'.. 처음 본 사람들한테 이름 말 안해주는데 ㅎㅎ 그냥 혜성이라는 별명으로 불러줘요 ㅋㅋㅋ'");
			System.out.println("뭐지 혜성 맞았나 왠 별명으로 불러달래지... 많이 수상하다...");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		
		System.out.println("\n\n\n'음 그러면 어차피 기다리는 것 대화를 해보자!\n");

		System.out.println("1. 그쪽은 왜 혼자 오셨어요?"); 
		System.out.println("2. 그쪽은 혹시 애인 없으세요??"); 
		System.out.println("3. 그쪽은 혹시 몇 살이세요???"); 
		System.out.println("4. 성함이 어떻게 되세요???? (물어보지 않은 질문의 번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'저도 혼자 있기 싫은데.. 하하 이렇게 됐네요.. '");
			System.out.println("왠지 모르게 이 사람 많이 외로워 보인다..");

		}
		else if(number == 2) {
			System.out.println("'그러게요.. 저도 그쪽과 같은 애인 사귀어서 이렇게 데이트 하고 싶었는데.. ㅎㅎ'");
			System.out.println("왠지 모르게 이 사람 어떤 사연이 있어 보인다..");
		}
		else if(number == 3) {
			System.out.println("'저요? 음 이번해가 2018년이니까... 15년 지났으니까 30대 중반인가???'");
			System.out.println("누가 봐도 20대 초반으로 보이는데.. 엄청난 동안인가?");
		}
		else if(number == 4) {
			System.out.println("'.. 처음 본 사람들한테 이름 말 안해주는데 ㅎㅎ 그냥 혜성이라는 별명으로 불러줘요 ㅋㅋㅋ'");
			System.out.println("뭐지 혜성 맞았나 왠 별명으로 불러달래지... 많이 수상하다...");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("\n\n\n'음 그러면 어차피 기다리는 것 대화를 해보자!\n");

		System.out.println("1. 그쪽은 왜 혼자 오셨어요?"); 
		System.out.println("2. 그쪽은 혹시 애인 없으세요??"); 
		System.out.println("3. 그쪽은 혹시 몇 살이세요???"); 
		System.out.println("4. 성함이 어떻게 되세요???? (물어보지 않은 질문의 번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'저도 혼자 있기 싫은데.. 하하 이렇게 됐네요.. '");
			System.out.println("왠지 모르게 이 사람 많이 외로워 보인다..");

		}
		else if(number == 2) {
			System.out.println("'그러게요.. 저도 그쪽과 같은 애인 사귀어서 이렇게 데이트 하고 싶었는데.. ㅎㅎ'");
			System.out.println("왠지 모르게 이 사람 어떤 사연이 있어 보인다..");
		}
		else if(number == 3) {
			System.out.println("'저요? 음 이번해가 2018년이니까... 15년 지났으니까 30대 중반인가???'");
			System.out.println("누가 봐도 20대 초반으로 보이는데.. 엄청난 동안인가?");
		}
		else if(number == 4) {
			System.out.println("'.. 처음 본 사람들한테 이름 말 안해주는데 ㅎㅎ 그냥 혜성이라는 별명으로 불러줘요 ㅋㅋㅋ'");
			System.out.println("뭐지 혜성 맞았나 왠 별명으로 불러달래지... 많이 수상하다...");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		
		System.out.println("\n\n\n'음 그러면 어차피 기다리는 것 대화를 해보자!\n");

		System.out.println("1. 그쪽은 왜 혼자 오셨어요?"); 
		System.out.println("2. 그쪽은 혹시 애인 없으세요??"); 
		System.out.println("3. 그쪽은 혹시 몇 살이세요???"); 
		System.out.println("4. 성함이 어떻게 되세요???? (물어보지 않은 질문의 번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'저도 혼자 있기 싫은데.. 하하 이렇게 됐네요.. '");
			System.out.println("왠지 모르게 이 사람 많이 외로워 보인다..");

		}
		else if(number == 2) {
			System.out.println("'그러게요.. 저도 그쪽과 같은 애인 사귀어서 이렇게 데이트 하고 싶었는데.. ㅎㅎ'");
			System.out.println("왠지 모르게 이 사람 어떤 사연이 있어 보인다..");
		}
		else if(number == 3) {
			System.out.println("'저요? 음 이번해가 2018년이니까... 15년 지났으니까 30대 중반인가???'");
			System.out.println("누가 봐도 20대 초반으로 보이는데.. 엄청난 동안인가?");
		}
		else if(number == 4) {
			System.out.println("'.. 처음 본 사람들한테 이름 말 안해주는데 ㅎㅎ 그냥 혜성이라는 별명으로 불러줘요 ㅋㅋㅋ'");
			System.out.println("뭐지 혜성 맞았나 왠 별명으로 불러달래지... 많이 수상하다...");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		
		System.out.println("\n\n\n우리는 1시간의 기다림이 전혀 지루하게 느껴지지 않을 만큼 많은 얘기를 나누었고 서로에 대해 많이 알게 되었다!!\n");
		System.out.println("'이제 우리가 탈 차례에요!! 얼른 제일 끝으로 와요!!'"); 
		System.out.println("재미있다고 같이 타자고 한 그(녀)가 나보다 더 무서워한다.. 당신의 행동은?");

		System.out.println("1. 손을 잡아준다!"); 
		System.out.println("2. 안전바를 잡고 있는 손을 억지로 떼서 만세를 시킨다!!"); 
		System.out.println("3. 귓속말로 겁쟁이라고 놀린다!!!"); 
		System.out.println("4. 안아주며 기저귀 있으니 걱정하지 말고 지리라고 한다!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("너무 무서운지 얼음장 같이 손이 차갑다..");

		}
		else if(number == 2) {
			System.out.println("손을 억지로 떼려 하니 너무 무서운지 얼음장 같이 손이 차갑기에 그만 둔다.");
			
		}
		else if(number == 3) {
			System.out.println("귀 가까이 입을 갖다대니 너무 무서운지 얼음장 같이 귀가 차갑다.");
			
		}
		else if(number == 4) {
			System.out.println("안심을 시키려 안았더니 너무 무서운지 얼음장 같이 몸이 차갑다. ");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("\n\n\n'왜 무서운거 못 타면서 바이킹을 타자고 했어요 ㅋㅋㅋ 그러면 조금 덜 무서운거 타러가요!!'\n");
		System.out.println("'어떤게 이거보다 덜 무서워요?'"); 

		System.out.println("1. 혜성씨 그러면 혜성특급을 타러 가요 ㅋㅋㅋ!"); 
		System.out.println("2. 바이킹보다 덜 무서운 혜성특급을 타러가죠!!"); 
		System.out.println("3. 좀 무서울수도 있지만 혜성특급 타러 가요!!!"); 
		System.out.println("4. 혜성특급 타러 밖으로 나가 보죠!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'으... 안돼!!! 정말로 미안한데요... 거기는 가지 말아요 네?' ");
			System.out.println("'깜짝이야.. 혜성특급은 이거보다 덜 무서운데 왜 그러세요.. 무슨 일 있었어요?' ");
			System.out.println("'아.. 아니에요.. 제가 2003년에 있던 일이 기억나서요.. 우리 그냥 다른거 타러 가요 ㅎㅎ 미안헤요 ㅜㅠ' ");
			System.out.println("음..바이킹 타고 좀 돌았나보다.. 다른걸 타러 가자 ");
		}
		else if(number == 2) {
			System.out.println("'으... 안돼!!! 정말로 미안한데요... 거기는 가지 말아요 네?' ");
			System.out.println("'깜짝이야.. 혜성특급은 이거보다 덜 무서운데 왜 그러세요.. 무슨 일 있었어요?' ");
			System.out.println("'아.. 아니에요.. 제가 2003년에 있던 일이 기억나서요.. 우리 그냥 다른거 타러 가요 ㅎㅎ 미안헤요 ㅜㅠ' ");
			System.out.println("음..바이킹 타고 좀 돌았나보다.. 다른걸 타러 가자 ");
			
		}
		else if(number == 3) {
			System.out.println("'으... 안돼!!! 정말로 미안한데요... 거기는 가지 말아요 네?' ");
			System.out.println("'깜짝이야.. 혜성특급은 이거보다 덜 무서운데 왜 그러세요.. 무슨 일 있었어요?' ");
			System.out.println("'아.. 아니에요.. 제가 2003년에 있던 일이 기억나서요.. 우리 그냥 다른거 타러 가요 ㅎㅎ 미안헤요 ㅜㅠ' ");
			System.out.println("음..바이킹 타고 좀 돌았나보다.. 다른걸 타러 가자 ");
		}
		else if(number == 4) {
			System.out.println("'으... 안돼!!! 정말로 미안한데요... 거기는 가지 말아요 네?' ");
			System.out.println("'깜짝이야.. 혜성특급은 이거보다 덜 무서운데 왜 그러세요.. 무슨 일 있었어요?' ");
			System.out.println("'아.. 아니에요.. 제가 2003년에 있던 일이 기억나서요.. 우리 그냥 다른거 타러 가요 ㅎㅎ 미안헤요 ㅜㅠ' ");
			System.out.println("음..바이킹 타고 좀 돌았나보다.. 다른걸 타러 가자 ");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("\n\n\n'그러면 평생 못 타본 연인들이나 타는 로맨틱한 놀이기구를 타러 가볼까?'\n");

		System.out.println("1. 아름다운 회전목마를 타고 사진도 찍자!"); 
		System.out.println("2. 사랑도 떠오르는 풍선비행을 타러 가고 사진도 찍자!!"); 
		System.out.println("3. 연인들이 함께 가는 필수코스인 유령성의 초대를 보러가고 그 앞에서 사진도 찍자!!!"); 
		System.out.println("4. 후룸라이드 함께 타고 기념 사진도 사자!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'하하 회전목마도 그쪽이랑 같이 타니까 진짜 연인 같네요...'");
			System.out.println("'저기.. 아직 그쪽 이름도 모르지만.. 이런 것도 인연인데 사진 한번 찍죠 ㅎㅎ'");
			System.out.println("혜성씨와 함께 사진도 찍게 됩니다. ");
		}
		else if(number == 2) {
			System.out.println("'하하 풍선비행도 그쪽이랑 같이 타니까 진짜 연인 같네요...'");
			System.out.println("'저기.. 아직 그쪽 이름도 모르지만.. 이런 것도 인연인데 사진 한번 찍죠 ㅎㅎ'");
			System.out.println("혜성씨와 함께 열기구 위에서 사진도 찍게 됩니다. ");
			
		}
		else if(number == 3) {
			System.out.println("'하하 유령성 같은 무서운 곳도 그쪽이랑 같이 들어오니까 진짜 연인 같네요...'");
			System.out.println("'저기.. 아직 그쪽 이름도 모르지만.. 이런 것도 인연인데 사진 한번 찍죠 ㅎㅎ'");
			System.out.println("혜성씨와 함께 유령성의 초대 앞에서 사진도 찍게 됩니다. ");
		}
		else if(number == 4) {
			System.out.println("'하하 후룸라이드도 그쪽이랑 같이 타고 사진도 찍히니까 진짜 연인 같네요...'");
			System.out.println("사진이 흐릿하게 나온 것도 같지만 함께 찍힌 사진도 기념으로 하나 사게 됩니다. ");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		System.out.println("\n\n\n'롯데월드 호러 할로윈 퍼레이드가 시작됩니다!!'\n");
		System.out.println("'엇 우리 저기 퍼레이드 보러 가요 ㅋㅋㅋ 귀신 분장하고 쇼 하나봐요!!'"); 
		System.out.println("'혜성씨와 함께 퍼레이드를 보던 당신.. 오늘 아니면 다시는 보지 못할까봐 숨겨왔던 혜성씨에 대한 감정을 고백하려 합니다.'"); 

		System.out.println("1. 저기.. 혜성씨.. 사실 그쪽 좀 엉뚱하고 이상하기도 하지만.. 이것도 인연인데 한번 만나 볼까요?"); 
		System.out.println("2. 혜성씨.. 10살 넘게 차이 나지만 그쪽 좋아요!! 한번 만나 보죠!!"); 
		System.out.println("3. 혜성씨.. 그쪽의 차가운 손도 창백한 얼굴도 다 좋아요.. 저랑 사귀어 주세요!!!"); 
		System.out.println("4. 혜성씨... 사랑해요!!!! (번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("??? 혜성씨 어디갔지?");
			System.out.println("내가 마음에 안들어 몰래 도망 갔는지 퍼레이드 중인 귀신들과 관객들만 보일 뿐 어디에도 혜성씨는 보이지 않는다... ");

		}
		else if(number == 2) {
			System.out.println("??? 혜성씨 어디갔지?");
			System.out.println("내가 마음에 안들어 몰래 도망 갔는지 퍼레이드 중인 귀신들과 관객들만 보일 뿐 어디에도 혜성씨는 보이지 않는다... ");
			
		}
		else if(number == 3) {
			System.out.println("??? 혜성씨 어디갔지?");
			System.out.println("내가 마음에 안들어 몰래 도망 갔는지 퍼레이드 중인 귀신들과 관객들만 보일 뿐 어디에도 혜성씨는 보이지 않는다... ");
			
		}
		else if(number == 4) {
			System.out.println("??? 혜성씨 어디갔지?");
			System.out.println("내가 마음에 안들어 몰래 도망 갔는지 퍼레이드 중인 귀신들과 관객들만 보일 뿐 어디에도 혜성씨는 보이지 않는다... ");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("\n\n\n주변 사람들에게 같이 찍었던 물어보자!!\n");
		System.out.println("엇...  뭐지??? 분명 아까 같이 둘이 찍었는데 왜 나 혼자만 나와 있는거야..."); 
		System.out.println("갑자기 머리부터 발 끝까지 소름이 쭈욱 돋는다..."); 
		System.out.println("이럴리가 없어... 주변 알바들한테 한번 물어보자!!"); 

		System.out.println("1. 좀비 분장한 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("2. 자이로드롭 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("3. 츄러스파는 알바한테 가서 혜성씨에 대해 물어본다!!!(번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'크르러어엉 하아악'");
			System.out.println("좀비 훈련을 잘 받았는지 대화를 안하려 한다. ");

		}
		else if(number == 2) {
			System.out.println("'저는 처음 들어 보는데요?'");
			System.out.println("잘 모르는 듯 하다.");
			
		}
		else if(number == 3) {
			System.out.println("'저 오늘 처음 와서.. 잘 모르겠어요..'");
			System.out.println("괜히 신입 알바 겁을 준 듯 하다.");
			
		}
	
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("이럴리가 없어... 주변 알바들한테 한번 물어보자!!"); 

		System.out.println("1. 좀비 분장한 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("2. 자이로드롭 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("3. 츄러스파는 알바한테 가서 혜성씨에 대해 물어본다!!!(다른 번호를 입력 해주세요)"); 
		

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'크르러어엉 하아악'");
			System.out.println("좀비 훈련을 잘 받았는지 대화를 안하려 한다. ");

		}
		else if(number == 2) {
			System.out.println("'저는 처음 들어 보는데요?'");
			System.out.println("잘 모르는 듯 하다.");
			
		}
		else if(number == 3) {
			System.out.println("'저 오늘 처음 와서.. 잘 모르겠어요..'");
			System.out.println("괜히 신입 알바 겁을 준 듯 하다.");
			
		}
		
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		System.out.println("이럴리가 없어... 주변 알바들한테 한번 물어보자!!"); 

		System.out.println("1. 좀비 분장한 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("2. 자이로드롭 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("3. 츄러스파는 알바한테 가서 혜성씨에 대해 물어본다!!!(다른 번호를 입력 해주세요)"); 
		

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'크르러어엉 하아악'");
			System.out.println("좀비 훈련을 잘 받았는지 대화를 안하려 한다. ");

		}
		else if(number == 2) {
			System.out.println("'저는 처음 들어 보는데요?'");
			System.out.println("잘 모르는 듯 하다.");
			
		}
		else if(number == 3) {
			System.out.println("'저 오늘 처음 와서.. 잘 모르겠어요..'");
			System.out.println("괜히 신입 알바 겁을 준 듯 하다.");
			
		
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("이럴리가 없어... 주변 알바들한테 한번 물어보자!!"); 

		System.out.println("1. 좀비 분장한 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("2. 자이로드롭 알바한테 가서 혜성씨에 대해 물어본다!"); 
		System.out.println("3. 츄러스파는 알바한테 가서 혜성씨에 대해 물어본다!!!"); 
		System.out.println("4. 혜성특급 알바한테 가서 혜성씨에 대해 물어본다!!!! (다른 번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("'크르러어엉 하아악'");
			System.out.println("좀비 훈련을 잘 받았는지 대화를 안하려 한다. ");

		}
		else if(number == 2) {
			System.out.println("'저는 처음 들어 보는데요?'");
			System.out.println("잘 모르는 듯 하다.");
			
		}
		else if(number == 3) {
			System.out.println("'저 오늘 처음 와서.. 잘 모르겠어요..'");
			System.out.println("괜히 신입 알바 겁을 준 듯 하다.");
			
		}
		else if(number == 4) {
			System.out.println("'??? 혹시 당신도 '");
			System.out.println("'??? 혜성씨를 보셨나요? '");
		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
		System.out.println("'그 분... 저랑 13년 전인 2003년... 함께 이 곳에서 알바하던 분이에요...'"); 
		System.out.println("'정말 밝고 명량한 친구였는데.. 기계 오작동으로 다리가 레일에 끼는 안타까운 사고를 당하고 과다출혈로 죽게 되었어요... '"); 
		System.out.println("'매년 할로윈 시즌 될 때마다 당신처럼 같이 사진 찍고 퍼레이드 보다가 사라졌다고 찾으러 다니길래 처음엔 믿지 않았는데 당신 같은 사람이 한둘이어야지... '"); 
		System.out.println("'아마도 죽은게 너무 억울해서 이승을 떠나지 못하나봐요... '"); 

		System.out.println("1. 말도 안돼... 내가 귀신이랑 데이트를 한거야?"); 
		System.out.println("2. 아.. 이건 꿈인가??"); 
		System.out.println("3. 오 하나님 아버지 하늘에 계신 우리 아버지여 아버지의 이름을...!!!"); 
		System.out.println("4. ...혜성씨... 당신은 도대체!!!! (다른 번호를 입력 해주세요)"); 

		number = input.nextInt();
		if(number == 1) {
			System.out.println("정신을 차리고 집으로 돌아와보니 실제로 2003년 혜성특급 사고가 있었다고 한다..");
			System.out.println("'데쓰월드 10새끼들...혜성씨.. 억울함 풀고 다른 생에서 행복하길 바래요...'");

		}
		else if(number == 2) {
			System.out.println("정신을 차리고 집으로 돌아와보니 실제로 2003년 혜성특급 사고가 있었다고 한다..");
			System.out.println("'데쓰월드 10새끼들...혜성씨.. 억울함 풀고 다른 생에서 행복하길 바래요...'");

			
		}
		else if(number == 3) {
			System.out.println("정신을 차리고 집으로 돌아와보니 실제로 2003년 혜성특급 사고가 있었다고 한다..");
			System.out.println("'데쓰월드 10새끼들...혜성씨.. 억울함 풀고 다른 생에서 행복하길 바래요...'");

			
		}
		else if(number == 4) {
			System.out.println("정신을 차리고 집으로 돌아와보니 실제로 2003년 혜성특급 사고가 있었다고 한다..");
			System.out.println("'데쓰월드 10새끼들...혜성씨.. 억울함 풀고 다른 생에서 행복하길 바래요...'");

		}
		else {
			System.out.println("잘못 입력 하셨습니다. 처음부터 다시 실행해주세요");
		}
		
		
	}
}


