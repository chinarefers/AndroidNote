
				1.��һ��ʹ��
				cd f: 
				 git init
				 git add -A
				 git commit -m'first commit'
				 git remote add origin https://github.com/forezp/WeChatRecord.git
				 git push -u origin master

				2.��Զ���вֿ⣬����ύ

				git add -A
				git commit -m'first commit'
				git push origin master

				3.�����ʾԶ�ֿ̲��и���,reject ref...
				git  pull 
				git push


			4.git һЩ��������
				echo "# WeChatRecord" >> README.md
				git init
				git add README.md
				git commit -m "first commit"
				git remote add origin https://github.com/forezp/WeChatRecord.git
				git push -u origin master

				��or push an existing repository from the command line
				git remote add origin https://github.com/forezp/WeChatRecord.git
				git push -u origin master

				git add -A
				git commit -m'fist commmit'

				$ cd d:     //���ļ���
				$ mkdir  testgit 
				$  cd testgit
				$ pwd       //��ʾ��ǰ��Ŀ¼
				$ git init //�����Ŀ¼���git���Թ���Ĳֿ�
				$ git add readme.txt   ��ӵ��ݴ�������ȥ��
				$ git add dir/files     �ķ�ʽ����ļ�
				$  git commit -m "�ύע��" //����Git�����ļ��ύ���ֿ⡣
				$ git status   //�鿴״̬
				$  git diff  readme.txt    //�鿴����
				$  git log //�鿴�ļ���־
				$  git reset  --hard HEAD^   //����
				$  cat readme.txt   //�鿴
				$ git checkout  -- file    //���Զ������������޸�
				$  git remote add origin https://github.com/tugenhua0707/testgit.git
				$   git push  
				$  git push -u origin master
				$ git push origin master