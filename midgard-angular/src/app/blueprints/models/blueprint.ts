import { BlueprintField } from './blueprint-field';

export interface Blueprint {
  name: string;
  status: string;
  secured: boolean;
  fields: BlueprintField[];
}
