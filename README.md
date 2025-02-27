# AutoGuard example project
This repository serves as showcase for [AutoGuard](https://github.com/MSA-API-Management/AutoGuard).
AutoGuard is set up to report breaking REST API changes in pull and merge requests for [GitHub](.github/workflows/autoguard.yml) and [GitLab](.gitlab-ci.yml).

The repository contains a minimal Spring Boot web service with a single controller that consists of three REST API methods for adding and querying _customer_ data models.

## Trying Out AutoGuard
### Option 1: Introduce changes locally

If you want to test AutoGuard's functionality, you can **fork this repository**. After forking, make sure to **enable GitHub Actions** in your repository settings.

#### Prerequisites
Ensure you have the following installed before running or modifying the Spring Boot service:
- Java (JDK 11+)
- Maven
- Git
- An IDE of your choice (e.g., IntelliJ IDEA)

#### Step-by-Step Guide

1. **Fork this repository** on GitHub.
2. **Clone your fork** and navigate into the project directory:
   ```sh
   git clone https://github.com/YOUR-GITHUB-USERNAME/AutoGuard-example-project.git
   cd AutoGuard-example-project
   ```  
3. **Create a new branch** in your fork:
   ```sh
   git checkout -b feature-branch
   ```  
4. **Introduce a breaking change** in the REST API (e.g., renaming endpoints, modifying request/response models, changing parameters).
5. **Commit and push your changes**:
   ```sh
   git add .
   git commit -m "Introduce breaking change for testing AutoGuard"
   git push origin feature-branch
   ```  
6. **Create a pull request (PR) in your forked repository** (please not to the original repository).
7. **Wait for AutoGuard to analyze your changes**. It runs automatically as part of the PR checks.
8. **Review the results** in the **GitHub Actions logs** and **artifacts** on the job summary page.

We also provide a demonstration video [on YouTube](https://www.youtube.com/watch?v=3qeWIVfMvWE).

### **Option 2: Use GitHub's web interface**

If you prefer not to install the prerequisites, you can perform all steps directly on GitHub:

1. **Fork this repository** on GitHub.
2. **Go to your forked repository** and click on the "Code" tab.
3. **Create a new branch**: Click the "branch" dropdown, type a new branch name (e.g., `feature-branch`), and press Enter.
4. **Introduce a breaking change** in the REST API directly on GitHub by opening files and clicking the "Edit" button (e.g., renaming endpoints, modifying request/response models, changing parameters).
5. **Commit your changes**: Scroll down to "Commit changes", enter a message, and select "Commit directly to `feature-branch`".
6. **Create a pull request (PR) in your forked repository** (please not to the original repository):
    - Go to the "Pull requests" tab in your forked repo.
    - Click "New pull request".
    - Select `feature-branch` as the source branch.
    - Select a target branch in _your own repository_.
    - Click "Create pull request".
7. **Wait for AutoGuard to analyze your changes**. It runs automatically as part of the PR checks.
8. **Review the results** in the **GitHub Actions logs** and **artifacts** on the job summary page.

