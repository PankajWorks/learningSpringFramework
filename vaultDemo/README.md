## Vault 
### Installation
brew install vault
OR 
Install from https://www.vaultproject.io/downloads.html

### Start in Dev mode
`vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"`

### Write in KV
```bash
export VAULT_TOKEN="00000000-0000-0000-0000-000000000000"
export VAULT_ADDR="http://127.0.0.1:8200"
vault kv put secret/vaultDemo demo.username=demouser demo.password=demopassword
vault kv put secret/vaultDemo/cloud demo.username=clouduser demo.password=cloudpassword
```

## Load the application in Idea and Run



