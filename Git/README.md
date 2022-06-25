# 06.25 📝
## Git 사용법 🎠
### 1. git 초기화
* git init

### 2. 현재 폴더 상황
* git status

### 3. 모든 파일 버전에 담기
* git add . 

### 4. 커밋 작성
* git commit -m " "

### 5. 커밋 없이 revert -> 따로 커밋
* git revert --no-commit 해시

### 6. 브랜치 생성
* git branch 브랜치명

### 7. 브랜치 목록
* git branch

### 8. 브랜치 전환
* git switch 브랜치명

### 9. 브랜치 삭제
* git branch -d 브랜치명

### 10. 브랜치 이름 변경
* git branch -m 기존_브랜치명 새_브랜치명

### 11. 브랜치 내역 편리하게 보기
* git log --all --decorate --oneline --graph

### 12. 브랜치 병합
* 1) git merge 브랜치명 ( 브랜치 내역 커밋에 남음)
* 2) git rebase 브랜치명 ( 브랜치 내역 커밋에 남지 X, 비추)

### 12-1) 브랜치 병합 중단
* git merge --abort

### 13. 브랜치 삭제
* git branch -d <branch name>

### 14. 저장소 확인
* git remote -v

### ✨15. 깃허브 레포지토리 생성 후 복붙
* git remote add origin HTTPS
git branch -M main
git push -u origin main

### 16. 레포지토리 복사 
* git clone HTTPS

### 16-1) 특정 브랜치만 clone
* git clone -b {branch_name} --single-branch {저장소 URL}

### 17. push, pull 동시에
* git pull --no-rebase