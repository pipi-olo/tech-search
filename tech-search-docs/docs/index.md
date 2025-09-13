# Welcome to Tech Search Docs

The tech-search project is a vibe-coding based project. Tech-Search Docs is a repository for managing the SSOT (Single Source of Truth) for vibe-coding.
It manages various documents such as overall architecture, common conventions and API specifications for each service in one place.

## Project Rules
* All code be written via vibe-coding using GitHub Copilot.
* Files used by GitHub Copilot are centrally managed in the `tech-search-docs` repository.
    * Each service must reference the `tech-search-docs/.github` folder via a symbolic link.

## Project layout
```
tech-search-docs/
├── .github/                          # GitHub 관련 설정
├── docs/
│   ├── services/
│   │   ├── post-service/
│   │   │   ├── index.md              # 서비스 개요, 담당팀, Repo 링크 등
│   │   │   ├── guide/
│   │   │   └── api/
│   │   │
│   │   └── search-service/
│   │       ├── index.md
│   │       ├── guide/
│   │       └── api/
│   │
│   ├── architecture/
│   │   ├── overall-architecture.md   # 전체 시스템 아키텍처 (다이어그램 포함)
│   │   └── event-storming.md         # 이벤트 스토밍 결과물
│   │
│   └── conventions/
│       ├── api-design-guide.md       # 전사 API 설계 가이드
│       └── commit-message-rules.md   # Git 커밋 메시지 규칙
│
├── mkdocs.yml                        # MkDocs 설정 파일 (정적 사이트 생성기)
└── requirements.txt                  # Python 의존성 (MkDocs 플러그인 등)
```